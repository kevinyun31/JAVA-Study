package testStudy1;

import java.util.ArrayList;

class Person {
    String name;
    String tell;

    public Person(String name, String tell) {
        this.name = name;
        this.tell = tell;
    }
}

public class PhoneNumber {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("본채", "546834689417"));
        list.add(new Person("만채", "222228/4156"));
        list.add(new Person("홍은채", "11117156"));

        for (Person obj : list)
            System.out.println("(" + obj.name + "," + obj.tell + ")");
    }
}
