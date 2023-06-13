package testStudy2;

class Person {
    private String regnumer;
    private double weight;
    protected int age;
    String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String[] args) {

        Student obj = new Student();
        // obj.regNumber = "658465416" // 주민번호는 String 으로써 " " 안에 적는다
        // obj.weight = 75.0; // 주민번호와 동일 하게 부모 클래스에서 private를 걸어 놔서 사용 못한다.
        obj.age = 19;
        obj.name = "홍은채";
        obj.setWeight(45);
        obj.getWeight();

        System.out.println("나이는 " + obj.age + " 이름은 " + obj.name + " 몸무게는 " + obj.getWeight());
    }
}
