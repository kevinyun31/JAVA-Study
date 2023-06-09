package testStudy1;

import java.net.PortUnreachableException;

public class MyStar {
    public static void main(String[] args) {

        int end = 0;

        for (int k = 0; k < 3; k++) { // 행을 반복
            end = end + 2;
            for (int i = 1; i < end; i++) {
                System.out.print("*");

            }
            System.out.println();
        }

        int star = 5;

        for (int i = 0; i < 2; i++) {
            star = star - 2;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}