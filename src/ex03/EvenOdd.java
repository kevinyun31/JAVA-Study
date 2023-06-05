package ex03;

import java.util.*;;

public class EvenOdd {
    // enen=짝수 odd=홀수
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력된 정수는 짝수다");
        } else {
            System.out.println("입력된 정수는 홀수다");
        }

    }

}
