package testStudy4;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.text.html.FormView;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        /*
        
        *****
        *****
        *****
        *****
        *****
        
        */

        for (int i = 0; i < 5; i++) {

            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        // 별 (*) 왼쪽 삼각형 만들기

        /*
          
          * 
          **
          ***
          ****
          *****
        
         */
        for (int i = 0; i < 5; i++) {
            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            // System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("--------------------------");

        // 별 (*) 오른쪽 삼각형 만들기

        // ssss*
        // sss**
        // ss***
        // s****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        // 별 (*) 다이아 모양 만들기

        // ss*
        // s***
        // *****
        // s***
        // ss*

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("* ");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("---------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    } // main

}// 클래스
