package testStudy5;

public class SingletonTest {
    public static void main(String[] args) {
        
        SingletonPattern single1 = SingletonPattern.getInstance();
        SingletonPattern single2 = SingletonPattern.getInstance();

        //5, 5
        System.out.println(single1.getNum());
        System.out.println(single2.getNum());
        
        single1.setNum(11);
        //11, 11
        System.out.println(single1.getNum());
        System.out.println(single2.getNum());

        single2.setNum(22);
        //22, 22
        System.out.println(single1.getNum());
        System.out.println(single2.getNum());

    }
}
