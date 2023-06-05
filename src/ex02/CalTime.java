package ex02;
import java.util.Scanner;

public class CalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("초를 입력하시오:");

        int time = sc.nextInt();
        int min = (time/60);
        int sec = (time%60);        
        System.out.println(time+"초는 "+min+"분 "+sec+"초입니다."); 
    
    }
    }
