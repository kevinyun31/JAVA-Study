package testStudy1;

class Pizza {

    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Pizza(String toppings) {
        this.toppings = toppings;
        count++;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("chesse");
        Pizza p2 = new Pizza("potato");
        Pizza p3 = new Pizza("bulgogi");
        Pizza p4 = new Pizza("supreme");
        int n = Pizza.count;

        System.out.println("지금까지 판매된 피자 개수 = " + n);

    }
}