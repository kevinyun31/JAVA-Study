package ex03;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("손님에게 받은 금액은 = ");
        final int money = sc.nextInt(); // final = int앞에 적어서 금액을 고정(상수)시킴.
        // sc.nextInt = terminal에 값을 입력가능하게 한다. int정수 값을 입력.

        // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
        // final int money = 120005160; //scanner 로 수정하기.<-문제여서 주석처리함.
        int count; // 동전 개수를 담을 변수
        int restMoney = money; // 남은 금액 변수 만들기

        // 아래 코드를 배열과 for문을 이용하여 리팩토링하시오.
        int[] tempMoney = { 500, 100, 50, 10 }; // {} = 안에 적은 수 만큼 배열이 생성.
        // []1차배열, [][]2차배열
        for (int i = 0; i < tempMoney.length; i++) { // .length는 배열의 필드.배열전체 범위까지.

            count = restMoney / tempMoney[i]; // 총금액에서 [i]500,100,50,10원 순서대로 나눔.
            restMoney = restMoney % tempMoney[i]; // % 나누고 남은금액이 돌아가서 재사용.
            System.out.println(tempMoney[i] + "원 : " + count + "개");
        }
    }
}
