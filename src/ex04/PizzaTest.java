package ex04;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        System.out.println("(" + myPizza.type + " , " + myPizza.size + ",)");

        Pizza yourPizza = new Pizza(24, "아무거나");
        System.out.println("(" + yourPizza.type + " , " + yourPizza.size + ",)");

    }
}
