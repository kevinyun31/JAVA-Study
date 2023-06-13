package ex05.composit;

public class Burger {
    private int price;
    private String desc;

    public Burger() {
        this(1000, "버거");

    }

    public Burger(int price) {
        this(price, "버거");

    }

    public Burger(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("버거가 만들어 졌습니다.");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
