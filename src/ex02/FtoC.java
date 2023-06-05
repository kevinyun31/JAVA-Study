package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//화씨or섭씨 중 하나를 사용자가 선택하게

//화씨값을 사용자가 넣으면 섭씨로 변환
        System.out.println("화씨온도를 입력하시오: ");
        double hasi = sc.nextInt();
        double subsi = 5.0 / 9.0 * (hasi - 32);
        System.out.println("섭씨온도는 " + subsi);
//한 줄 띄우고
        System.out.println();
//섭씨값을 사용자가 넣으면 화씨로 변환
        System.out.println("섭씨온도를 입력하시오");
        double subsi2 = sc.nextInt();
        double hasi2 = subsi2 * 9.0 / 5 + 32;
        System.out.println("화씨온도는 " + hasi2);

    }
}
