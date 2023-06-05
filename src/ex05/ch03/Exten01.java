package ex05.ch03;

class 지구인 {
    String name = "지구인";
}// 위로 다 풀스캔 당하여 "지구인"이 밑에서도 사용가능 해진다.

class 유럽인 extends 지구인 {
}

class 아시아인 extends 지구인 {
    void speak() {
        System.out.println("아시아어");
        // 오버라이드(무효화)하다.
    }
}

class 한국인 extends 아시아인 {
    void speak() {
        System.out.println("한국어");
    }// 자식이 부모꺼를 재정의 함.
     // 밑에 있는거는 상속(사용)이 안돼서 못 씀.
}

class 홍길동 extends 한국인 {
}

public class Exten01 {
    public static void main(String[] args) {
        한국인 p1 = new 한국인();
        // 아시아인 p1 = new 한국인();
        // 지구인 p1 = new 한국인();
        p1.speak();
        System.out.println(p1.name);

    }
}
