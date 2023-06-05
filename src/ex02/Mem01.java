package ex02;

class Hello {
 static int price = 5000;
String name = "바닐라 라떼";

void run(){
int n = 100;
System.out.println("달려랏");
}
}

public class Mem01 {

static int price = 3000;

    public static void main(String[] args) {
      System.out.println(price);
      System.out.println(Hello.price);
      Hello c = new Hello();
      System.out.println(c.name);

      c.run();
    }
    
}


