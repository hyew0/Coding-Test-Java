# 조건문

## BufferedReader
1. 개요
- 버퍼 사용: 키보드 입력을 버퍼(임시 메모리)에 모았다가 한 번에 프로그램으로 전달함.
- 속도: Scanner보다 데이터 처리 속도가 압도적으로 빠름. (시간 제한 있는 알고리즘 문제에 필수)
- 데이터 타입: 모든 입력을 무조건 String으로 반환함.

2. 주의사항 (Scanner와의 차이)
- 형변환 필수: 숫자를 입력받아도 문자로 인식하므로 Integer.parseInt() 등으로 변환해야 함.
- 공백 처리: 엔터(Line) 단위로만 읽음. 띄어쓰기 구분 시 StringTokenizer나 split()을 사용해야 함.
- 예외 처리: main 메소드에 throws IOException을 반드시 선언해야 함.

3. 사용 패턴 (코드)

```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
// 예외 처리(throws IOException) 필수
public static void main(String[] args) throws IOException {

        // 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 한 줄 읽기 (String 반환)
        String str = br.readLine();
        
        // 2. 공백 기준으로 자르기 (StringTokenizer 사용)
        StringTokenizer st = new StringTokenizer(str, " ");
        
        // 3. 형변환하여 사용
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a + b);
    }
}
```