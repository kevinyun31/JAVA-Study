package testStudy5;

class Calculator{
    public static int left;
    public static int right;
    public static void sum(){
        System.out.println(Calculator.left+Calculator.right);
}


public static void avg(){
System.out.println((Calculator.left+Calculator.right)/2);
}
}

class Employee {
    public static int period;
    public static int right;
    public static void sum(){
        System.out.println("급여: "+Employee.right*Employee.period);
    }

}



public class Company {
    public static void main(String[] args) {

        Calculator.left=10;
        Calculator.right=20;
Calculator.sum();

Employee.period = 4;
Employee.right = 5000;
Employee.sum();
    }
}
