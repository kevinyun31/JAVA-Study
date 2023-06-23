package ex06;

import javax.sound.sampled.SourceDataLine;

/**
 * 1. 추상클래스는 new 할 수 없다.
 * 2. 추상클래스는 일반메서드와 추상메서드를 가질 수 있다.
 * 3. 추상클래스는 상태변수를 가질 수 있다.
 */
abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다");
    }

    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    }

}

class 호랑이 extends 동물 {

    @Override
    public void speak() {
        System.out.println("왕왕");
    }

}

public class Abstract01 {
    public static void main(String[] args) {
        // new 동물();
        동물 d1 = new 호랑이();
        d1.name = "호랑이";

        사자 d2 = new 사자();
        d2.name = "사자";
        System.out.println(d1.name);
        System.out.println(d2.name);

    }
}