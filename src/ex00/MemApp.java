package ex00;

class 엘리스 {
    static String name = "엘리스";
    int height = 160;

    public 엘리스() {
    }

    void eat(int qty) {
        this.height = this.height + (10 * qty);
    }
}

public class MemApp {
    public static void main(String[] args) {
        엘리스 e = new 엘리스();
        e.eat(5);
    }
}
