package ex03;

public class MyStar02 {

    public static void main(String[] args) {
        int star = 6;

        for (int i = 0; i < 5; i++) {
            star = star - 1;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
