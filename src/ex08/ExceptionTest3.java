package ex08;

public class ExceptionTest3 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("ABC");
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("NumberFormat 예외 발생");
        }

    }
}
