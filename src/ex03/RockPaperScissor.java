package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int sci = 0;
    final int roc = 1;
    final int pap = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        if (user == computer)
            System.out.println("인간과 컴퓨터가 비겼음");
        else if (user == (computer + 1) % 3)
            System.out.println("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");

        else
            System.out.println("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");

        int n1 = (int) (Math.random() * 5) + 1;
        System.out.println(n1);
    }
}
