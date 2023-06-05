package ex02;
//책에 적힌 답내용 임.
import java.util.Scanner;
import java.util.*;

public class InputString {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오: ");
        name = sc.nextLine();
        System.out.println("나이를 입력하시오: ");
        age = sc.nextInt();

        System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
    }

}
