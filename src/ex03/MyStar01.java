package ex03;

public class MyStar01 {
    public static void main(String[] args) {

        // System.out.println("*"); // 별 1
        // System.out.println("**"); // 별 2
        // System.out.println("***"); // 별 3

        // 최종 리팩토링
        for (int k = 1; k < 6; k++) { // 행을 반복
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===========");

        // 리팩토링 코드
        int end = 0;
        for (int k = 0; k < 5; k++) { // 행을 반복
            end = end + 1;
            for (int i = 0; i < end; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===========");

        // 1단계 첫줄만 찍어보기 (반복문)
        end = end + 1;
        for (int i = 0; i < end; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 2단계 두번째줄만 찍어보기 (반복문)
        end = end + 1;
        for (int i = 0; i < end; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 3단계 세번째줄만 찍어보기 (반복문)
        end = end + 1;
        for (int i = 0; i < end; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 4단계 네번째줄만 찍어보기 (반복문)
        end = end + 1;
        for (int i = 0; i < end; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 5단계 다섯번째줄만 찍어보기 (반복문)
        end = end + 1;
        for (int i = 0; i < end; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 6단계 패턴 확인하기 - i값 달라지구나!!, 1씩 증가

        // 7단계 코드 리팩토링

    }

}