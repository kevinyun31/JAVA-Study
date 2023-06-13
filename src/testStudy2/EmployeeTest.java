package testStudy2;

class Person {
    String name;

    public Person() {
    }

    public Person(String theName) {
        this.name = theName;
    }
}

// ----------------------------------------------------------------------------
class EmployeeBaby extends Person {
    String id;

    public EmployeeBaby() {
        super();
    }

    public EmployeeBaby(String name) {
        super(name);
    }

    public EmployeeBaby(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + " name=" + name + "]";
    }

}
// -----------------------------------------------------------------------------------

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeBaby e = new EmployeeBaby("만채", "1538");
        System.out.println(e);
    }
}
