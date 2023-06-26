package testStudy5;

class StudentInfo {
    public int grade;

    StudentInfo(int grade) {
        this.grade = grade;
    }
}

class StudentPerson {
    public StudentInfo info;

    StudentPerson(StudentInfo info) {
        this.info = info;
    }
}

class EmployeeInfo {
    public int rank;

    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class EmployeePerson {
    public EmployeeInfo info;

    EmployeePerson(EmployeeInfo info) {
        this.info = info;
    }
}

// 리팩토링 안한 버전 리팩토링 하여 중복된 Person 클래스를 제거해보자
public class GenericDemo {

    public static void main(String[] args) {

        StudentInfo si = new StudentInfo(2);

        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade); // 2

        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);

    }
}
