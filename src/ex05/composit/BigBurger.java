package ex05.composit;

public class BigBurger extends Burger {

    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어 졌습니다.");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어 졌습니다.");
    }

    public BigBurger(int price) {
        super(price, "빅버거");
        System.out.println("빅버거가 만들어 졌습니다.");
    }

}