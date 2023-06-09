package testStudy1;

class MyMath {
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int +power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++)
            result *= base;
        return result;
    }
}

public class MyMathTest {
    public static void main(String args[]) {
        MyMath my = new MyMath();
        System.out.println("10의 3승은 " + my.power(10, 3));

    }
}
