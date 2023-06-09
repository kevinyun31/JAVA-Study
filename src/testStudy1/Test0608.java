package testStudy1;

public class Test0608 {
    // 정적 블록
    static int number;
    static String s;
    static {
        number = 23;
        s = "냥냥냥";
    }

    public static void main(String[] args) {
        System.out.println("number: " + number);
        System.out.println("s: " + s);

    }

}