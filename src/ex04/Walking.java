package ex04;

public class Walking {
    public static void main(String[] args) {
        // 1. 칼로리 계산을 위해 메서드를 호출하시오.
        int i = 3;
        double result = calculateCalory(5000);
        double result2 = calculateCaloryPork(i);

        // 3. 결과를 출력하시오.
        System.out.println("5000걸음 걸었을 때 소모칼로리: " + result);
        System.out.println("삼겹살 " + i + "인분: " + result2 + " kcal");
    }

    // 2. 칼로리 계산 메서드를 정의하시오.
    private static double calculateCalory(int walk) {
        return 0.02 * walk;
    }

    private static double calculateCaloryPork(int cal) {
        // 삼겹살 칼로리 계산
        return 180 * 5.179 * cal;
    }
}