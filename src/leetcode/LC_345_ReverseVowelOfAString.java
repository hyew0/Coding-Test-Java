package leetcode;

/*
 * [복습 필요]
 * - 날짜: 2026.09.29
 * - 핵심 개념: 투 포인터 (Two Pointers)
 * - 막혔던 부분: 중첩 while문 안에서 포인터가 교차하여 오작동하는 문제를 겪음.
 * - 깨달은 점: 내부 while문 조건에도 `left < right` 안전장치를 꼭 넣어야 불필요한 스왑과 OutOfBounds 에러를 막을 수 있음!
 */
public class LC_345_ReverseVowelOfAString {
    class Solution {
        public String reverseVowels(String s) {
        /*
        - 모음 구분 필요, 찾은 모음 반전 필요.
        - char[] 배열 이용해서 왼쪽과 오른쪽 동시 모음 확인, 모음인 자리에서 서로 변경해줌.
        */

            // 문자열 문자 배열로 전환
            char[] chars = s.toCharArray();

            //포인터로 사용할 정수 초기화
            int left = 0;
            int right = chars.length -1;

            //포인터가 교차하기전까지 교체
            while (left < right) {
                while (left < right && !isVowel(chars[left]) ){ //앞쪽이 모음이 아니고 포인터가 교차하지 않을 때 포인터 위치 옮김
                    left++;
                }
                while (left < right && !isVowel(chars[right])) {//뒤쪽이 모음이 아니고 포인터가 교차하지 않을 때 포인터 위치 옮김
                    right--;
                }


                if (left < right) {
                    char tempLeft = chars[left];
                    char tempRight = chars[right];

                    chars[left] = tempRight;
                    chars[right] = tempLeft;

                    left++;
                    right--;
                }
            }

            return new String(chars);
        }

        //모음 판별 헬퍼 메서드
        private boolean isVowel(char c) {
        /* -> memory를 더 많이 잡아먹어서 아래를 사용.
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
        */

            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }
    }
}
