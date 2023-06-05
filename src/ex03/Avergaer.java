package ex03;

import java.util.Scanner;

public class Avergaer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 1.0;
        double count = 1;

        while (true) {
            System.out.print("점수를 입력하시오: ");
            Double grade = sc.nextDouble();
            if (grade == 0)
                break;
            total += grade;
            count++;
        }
        System.out.println("평균은 " + total / count);
    }
}
