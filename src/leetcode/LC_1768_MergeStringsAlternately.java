package leetcode;

public class LC_1768_MergeStringsAlternately {

    /*
    문자가 번갈아 나오게 하기 위해 필요한 것.
    하나하나 번갈아 체크하며 출력이 되도록 해줘야 함.

    두 문자열을 번갈아가며 합치려면 두 단어 중 더 긴 단어의 길이만큼 반복문을 돌면서 각 단어의 글자를 하나씩 번갈아 가며 가져와야 함.

    또한 StringBuilder를 사용해서 모아서 한번에 출력( return ) 해줘야 함.
    */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int largeLength = Math.max(word1.length(), word2.length()); // 두 단어 중 더 긴 단어의 길이 찾음

        for (int i=0; i < largeLength; i++){
            if (i < word1.length()){ // word1의 문자열의 길이가 i의 길이보다 길어 문자가 남아있으면 추가.
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()){ // word2의 문자열의 길이가 i의 길이보다 길어 문자가 남아있으면 추가.
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
