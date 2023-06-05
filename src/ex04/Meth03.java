package ex04;

class Account {

    int deposit(int amount, int money) { // 입금 (입금할 금액, 계좌잔액)
        int restMoney = money + amount;
        return restMoney;
    }// return 메서드를 호출한 라인으로 값 반환

    int withdraw(int amount, int money) {// 출금 (입금할 금액, 계좌잔액)
        int restMoney = money - amount;
        return restMoney;
    }
}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;
        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 한번하기
        Account hAccount = new Account();
        System.out.println("홍길동의 통장 = hMoney");
        hMoney = hAccount.deposit(100, hMoney);
        System.out.println("남은 금액은 : " + hMoney + "원");
        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("남은 금액은 : " + hMoney + "원");

        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("남은 금액은 : " + hMoney + "원");
        System.out.println();
        System.out.println("임꺽정의 통장 = iMoney");
        // 임꺽정이 입금(100원)을 1번하고, 출금 2번(300,500)하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("남은 금액은 : " + iMoney + "원");

        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액은 : " + iMoney + "원");
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액은 : " + iMoney + "원");
        System.out.println();
        // 이체 (보낼 금액(amount), 받는사람잔액(receiverMoney),보낸사람잔액(senderMoney)
        // 리턴없이 출력만 해보기
        int aMount = 5000;
        int rMoney = 10000;
        int sMoney = 10000;

        Account rAccount = new Account();
        rMoney = rAccount.deposit(500, rMoney);
        System.out.println("받는사람 잔액 : " + rMoney);

        Account sAccount = new Account();
        rMoney = sAccount.withdraw(500, sMoney);
        System.out.println("받는사람 잔액 : " + sMoney);
    }
}
