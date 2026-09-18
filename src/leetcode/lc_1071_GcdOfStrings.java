package leetcode;

public class lc_1071_GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        /*
         핵심 원리:
         1. 두 문자열이 같은 기본 패턴의 반복으로 만들어졌다면, 순서를 바꿔 더해도 결과가 완벽히 똑같아야 한다.

         2. 패턴이 존재함이 증명되었다면, 그 '가장 긴' 공통 패턴의 길이는 두 문자열 길이의 최대공약수(GCD)와 같다.
          - 공통 패턴은 두 문자열의 길이를 모두 정확히 나누어 떨어지게 하는 '공약수'여야 함.
          - 그중 '가장 긴' 패턴을 찾고 있으므로, 두 길이의 '최대공약수'가 곧 정답 패턴의 길이가 됨.
         */

        String firstStr1 = str1 + str2;
        String firstStr2 = str2 + str1;

        // 1. 공통 패턴 존재 여부 검증
        // 결합 순서를 바꿨을 때 다르면, 애초에 공통된 반복 패턴이 없다는 뜻이므로 즉시 빈 문자열 반환
        if (!firstStr1.equals(firstStr2)){
            return "";
        }

        // 2. 가장 긴 공통 문자열의 길이 계산
        // 앞선 if문에서 공통 패턴이 존재함을 수학적으로 증명했으므로,
        // 안심하고 두 길이의 최대공약수(GCD)를 구하여 패턴의 크기를 확정함
        int largeLength = gcd(str1.length(), str2.length());

        return str1.substring(0, largeLength);

    }

    // 유클리드 호제법을 이용한 최대공약수 계산 메서드
    private int gcd(int a, int b){
        if ( b == 0){
            return a;
        }

        return gcd(b, a % b);
    }
}
