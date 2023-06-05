package ex03;

public class Coin02 {
    final int money = 120005160; // scanner 로 수정하기
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) { // 행위
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    // ----------------------------------------------------------------------
    // class밑 main 위에 사이공간에 메서드(모듈)를 불러오고 main에서 가져다 쓰기.
    public static void main(String[] args) {
        Coin02 c2 = new Coin02();
        c2.printRestMoney(500);
        c2.printRestMoney(100);
        c2.printRestMoney(50);
        c2.printRestMoney(10);
    }
}
