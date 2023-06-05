package ex04;

class Account {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public class AccountTest {
        public void main(String[] args) {
            Account obj = new Account();
            obj.setName("이해인");
            obj.setBalance(10000);
            System.out.println("이름은 " + obj.getName() +
                    "통장 잔고는 " + obj.getBalance() + "입니다.");

        }
    }
}
