package testStudy2;

class Guys {
    public int baseSalary = 3000;

    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Guys {

    @Override
    int getSalary() {
        // TODO Auto-generated method stub
        return (baseSalary + 2000);
    }
}

class Programmer extends Guys {

    @Override
    int getSalary() {
        // TODO Auto-generated method stub
        return (baseSalary + 3000);
    }
}

public class Money {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급 : " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급 : " + obj2.getSalary());
    }
}
