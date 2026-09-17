package baekjoon.B01_InputOutputAndArithmethic;

import java.util.Scanner;

/*
꼬마 정민
시간 제한	메모리 제한
1 초	    512 MB

문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.
* */
public class B11_1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a,b,c; // 1 ≤ A, B, C ≤ 10^12 이 조건이므로 int형이 아닌 long형으로 선언해야 한다.

        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        long sum = a + b + c;

        System.out.println(sum);

    }
}
