package ex06;

/**
 * 1.인터페이스는 new할 수 없다.
 * 2. 인터페이스는 static 변수를 만들 수 있다.
 * 3. 인터페이스는 추상메서드만 가진다.
 * 4.인터페이스는 노출 되는 것이고 기본적으로 public 이다.
 */
interface Remote {
    int NUM = 10; // Public static final

    void run(); // public abstract
}

public class Inter01 {
    public static void main(String[] args) {

    }
}
