package ex02;
// 책에서 하라고 하는 내용이다.
// Scanner을 이용해서 하는거란다.
import java.util.Scanner;

public class Add2_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y, sum;
 
    System.out.println("첫 번째 숫자를 입력하시오: ");
    x = sc.nextInt();

    System.out.println("두 번째 숫자를 입력하시오: ");
    y = sc.nextInt();

    sum = x + y;
    System.out.println("두수의 합은 "+sum+"입니다."); //합을 출력한다.
}    
}
