package testStudy5;

class StudentInfo {
    public int grade;

    StudentInfo(int grade) {
        this.grade = grade;
    }
}

class EmployeeInfo {
    public int rank;

    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class Person {
    public Object info;

    Person(Object info) {
        this.info = info;
    }
}

// 리팩토링 안한 버전 리팩토링 하여 중복된 Person 클래스를 제거해보자
public class GenericDemo2 {

    public static void main(String[] args) {

        Person p1 = new Person("부장");   
        EmployeeInfo ei = (EmployeeInfo) p1.info;
         System.out.println(ei.rank);

    }
}
