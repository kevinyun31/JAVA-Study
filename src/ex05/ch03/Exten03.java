package ex05.ch03;

abstract class Animal { // 추상클래스 Animal a = new Animal 사용을 못하게 함.
    abstract void speak(); // 추상메서드는 추상클래스 에서만 만들 수 있다.
    // 추상클래스를 만들었으면 꼭 밑에 클래스에서 사용을 해야만 한다.

}

class Bird extends Animal { // 무조건 몸체 클래스에 행위를 만들어야 한다. 안에 뭐할지 내용을 쓰라고.
    // 오버라이드 나타내는 주석같은 표현
    void speak() {
        System.out.println("짹짹");
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("음메");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("냥냥");
    }
}

public class Exten03 {
    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);

        Animal w = new Cow();
        start(w);
        Animal b = new Bird();
        start(b);
    }
}
