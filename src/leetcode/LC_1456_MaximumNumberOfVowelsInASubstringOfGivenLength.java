package leetcode;

public class LC_1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int subNum = 0;

        //첫번째 구간 모음 개수
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                subNum++;
            }
        }

        int max = subNum;

        //만약 첫번째에서 전체가 모음이면 바로 반납
        if (max == k) {
            return max;
        }

        //슬라이딩 윈도우를 통한 넣는 문자와 빼는 문자 모음 판별
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                subNum++;
            }

            if (isVowel(s.charAt(i-k))) {
                subNum--;
            }

            max = Math.max(subNum,max);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
