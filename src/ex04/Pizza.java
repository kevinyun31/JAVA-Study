package ex04;

public class Pizza {
    int size;
    String type;

    public Pizza() {
        size = 12;
        type = "슈퍼슈프림";
    }

    // publicPizza 클래스 이름은 같지만 ()랑(int s~~~~)매개변수 내용이 다르다
    public Pizza(int s, String t) {
        size = s;
        type = t;
    }

}
