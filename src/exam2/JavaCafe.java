package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        if (basePay < 8) {
            System.out.println("최저시급 에러");
            return;
        }
        if (hours > 60) {
            System.out.println("초과근무 시간 에러");
            return;
        }
        double pay = basePay * hours;
        /* 해당 메소드를 완성하세요. */
        if (hours > 40) {
            pay = pay + (hours - 40) * 1.5;
        }
        System.out.printf("$ %.2f\n", pay);
    }
}
