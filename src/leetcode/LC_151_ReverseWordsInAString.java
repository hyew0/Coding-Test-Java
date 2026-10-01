package leetcode;

public class LC_151_ReverseWordsInAString {
    public String reverseWords(String s) {
        /*
        -불필요한 공백은 제거하되 단어 사이의 하나의 공백은 넣어둘것.
        */

        //방법2. 투 포인터 이용 성능 올리기 -> 정규식 연산(split)과 불필요한 배열 생성(String[])이 없어 훨씬 빠르고 가벼움.

        StringBuilder sb = new StringBuilder();
        int i = s.length() -1; //문자열 뒤부터 공백 판별 위함

        while (i >= 0) {
            // 뒤에서부터 공백 무시하고 단어의 끝 글자 찾음
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;

            int end = i; // 단어의 끝 인덱스 저장

            //문자가 공백이 아닌 동안 인덱스 감소
            while ( i >= 0 && s.charAt(i) != ' ') i--;

            //만약 문자가 저장되어있으면 다음 단어와의 공백 유지를 위해 공백 삽입
            if (sb.length() > 0) {
                sb.append(" ");
            }

            //i는 공백 위치가 되었으므로 i + 1부터 end + 1 앞까지 잘라냄
            sb.append(s.substring(i + 1, end + 1));
        }

        return sb.toString();

        /*
        // 방법1

        //문자열 앞뒤 공백 제거 및 단어 슬라이스
        String[] words = s.trim().split("\\s+"); // 정규식 \\s+를 사용해서 1개 이상의 공백을 기준으로 슬라이스되도록 설정

        StringBuilder sb = new StringBuilder();

        //역순 문자열 배치
        for (int i = words.length -1; i >= 0; i--) {
            sb.append(words[i]);

            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString(); //문자열 반환
        */

    }
}
