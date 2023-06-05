package ex04;

public class WalkingTest {
    public static void main(String[] args) {
        // 1. 칼로리 계산을 위해 메서드를 호출하시오.

        double result = calculateCalory(5000);
        double result2 = yumyum(1, 2);
        // 3. 결과를 출력하시오.
        System.out.println("소모 칼로리 : " + result + "kcal");
        System.out.println("과자 한봉지 " + result2);
    }

    private static double calculateCalory(int walk) {
        return 0.02 * walk;
    }

    private static double yumyum(int eat, int gogi) {
        return 150 * (eat + gogi);
    }

}
