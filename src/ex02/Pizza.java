package ex02;
import java.util.*;;

public class Pizza {
    public static void main(String[] args) {
        double area1 = 2*3.141592*20*20;
        double area2 = 1*3.141592*30*30;
        System.out.println("20cm 피자 2개의 면적="+area1);
        System.out.println("30cm 피자 면적="+area2);
        System.out.print((area1 > area2)? "20cm 두 개":"30cm 한 개");
        System.out.println("를 주문하세요.");

        System.out.println(10>>1); // >> << 비트이동을 의미
        System.out.println(10<<1);
    }
    
}
