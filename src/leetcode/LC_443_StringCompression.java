package leetcode;

public class LC_443_StringCompression {
    public int compress(char[] chars) {
        int write = 0; // 덮어쓸 위치
        int read = 0;  // 읽을 위치

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            //연속된 동일 문자 세기
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            //문자 덮어쓰기
            chars[write++] = currentChar;

            //개수가 2 이상인 경우 숫자 덮어쓰기
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // 4. 최종 길이 반환
        return write;
    }
}
