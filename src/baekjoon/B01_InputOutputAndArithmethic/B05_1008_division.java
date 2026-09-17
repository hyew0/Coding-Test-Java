package baekjoon.B01_InputOutputAndArithmethic;

/*
A/B

시간 제한	메모리 제한
2 초	    128 MB

문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
    -> 오차 10^-9 이하의 의미: 보통 소수점 아래 9번째 자리 이상까지 정확하게 계산되어야 한다는 의미( 10^-9 = 0.000000001 )
       float 형은 소수점 아래 6~7자리 정도까지 정확하게 표현 가능. double 형은 소수점 아래 15~16자리 정도까지 정확하게 표현 가능.
       따라서 이 문제에서는 double 형을 사용해야 한다.
* */

import java.util.Scanner;

public class B05_1008_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a / b);
    }
}
