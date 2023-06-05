package ex03;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 5)
                break;
            System.out.print(i);

        }
        System.out.println();
        for (int i = 1; i < 7; i++) {
            if (i == 3)
                continue;
            System.out.print(i);

        }
    }
}
