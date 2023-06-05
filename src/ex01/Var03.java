package ex01;

public class Var03 {
    public static void main(String[] args) {
      // 업캐스팅or묵시적 형변환 작은걸 큰걸로
        int n1 = 10;
        double d1 = n1;
        System.out.println(d1);

      // 다운 캐스팅or명시적 형변환 큰걸 작은걸로
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2);

        // 문자 형변환 (아스키코드)
        // 010101111011 -> 65
        // char는 크기랑 상관없이 강제형변환(char) 해줘야함
        byte ch = 65;
        char data = (char)ch;
        System.out.println(data);
    }
}
