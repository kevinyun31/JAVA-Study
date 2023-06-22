package ex13;

import java.util.*;

class Monster {
    String name;
    double hp;

    public Monster(String name, Double hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "{ " + name + "," + hp + "}";
    }
}

public class VectorExample2 {
    public static void main(String[] args) {
        Vector<Monster> list = new Vector<>(); // <monster> 객체를 저장하는 벡터를 생성.

        list.add(new Monster("Mon1", 100.0));
        list.add(new Monster("Mon2", 200.0));
        list.add(new Monster("Mon3", 300.0));

        System.out.println("벡터의 크기 : " + list.size());
        System.out.println(list);
    }
}
