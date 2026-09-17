package baekjoon.B01_InputOutputAndArithmethic;

import java.util.Scanner;

/*
시간 제한	메모리 제한
2 초	    128 MB

문제
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A-B를 출력한다.

* */
public class B03_1001_substraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a-b);
    }
}
