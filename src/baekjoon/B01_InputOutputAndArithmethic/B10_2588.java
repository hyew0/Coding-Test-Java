package baekjoon.B01_InputOutputAndArithmethic;

import java.util.Scanner;

public class B10_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        int mul1 = A*(B%10);
        int mul2 = A*((B/10)%10);
        int mul3 = A*(B/100);

        System.out.println(mul1); // 첫 번째 자리 곱셈 결과
        System.out.println(mul2); // 두 번째 자리 곱셈 결과
        System.out.println(mul3); // 세 번째 자리 곱셈 결과
        System.out.println(mul1 + mul2*10 + mul3*100); // 최종 곱셈 결과
        //System.out.println(A*B); // 최종 곱셈 결과 (다른 방법)
    }
}
