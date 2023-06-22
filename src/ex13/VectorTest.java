package ex13;

import java.util.Vector; // new Vector하면 자동으로 import가 생성됨.

public class VectorTest {
    public static void main(String[] args) {

        Vector vc = new Vector(); // Vector()는 객체 생성시 크기를 안주어도 된다. 주어도 상관은 없다.

        vc.add("Hello World!"); // add 명령어로 어떤타입의 객체도 추가 가능하다.
        vc.add(new Integer(10));
        vc.add(20);

        System.out.println("Vector size : " + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element " + i + " : " + vc.get(i)); // get 으로 값을 호출 가능하다.
        }

        String s = (String) vc.get(0);
    }
}