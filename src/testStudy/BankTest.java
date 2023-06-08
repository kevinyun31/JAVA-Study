package testStudy;

class Bank {
    int account;
    String owner;
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    public String toString() {
        return "현재 잔액은 " + balance + "입니다.";
    }

}

public class BankTest {
    public static void main(String[] args) {
        Bank my = new Bank();

        my.deposit(0);
        System.out.println(my);
        my.withdraw(5000);
        System.out.println(my);
    }
}
