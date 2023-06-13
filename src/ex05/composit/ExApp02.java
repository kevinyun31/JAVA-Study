package ex05.composit;

public class ExApp02 {
    public static void main(String[] args) {
        Coke c2 = new Coke(400, "콜라");

        // 버거 세트 주세요!!
        Burger b1 = new Burger();
        Coke c1 = new Coke();
        Potato p1 = new Potato();
        BugerSet bs = new BugerSet(b1, c1, p1);
        BugerSet bs2 = new BugerSet();
        BugerSet bs3 = new BugerSet();
    }
}
