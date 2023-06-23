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

public class GenericDemo {

    public static void main(String[] args) {

        StudentInfo si = new StudentInfo(2);

    }
}
