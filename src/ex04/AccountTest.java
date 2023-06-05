package ex04;

public class AccountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("이해인");
        obj.setBalance(10000);
        System.out.println("이름은 " + obj.getName() +
                "통장 잔고는 " + obj.getBalance() + "입니다.");

    }
}
