package testStudy1;

import java.net.SocketTimeoutException;

public class RectTest {
    public static void main(String[] args) {
        Rect[] list; // 참조 변수 선언
        list = new Rect[5]; // 배열 객체 생성

        for (int i = 0; i < list.length; i++) // 배열 요소 생성
            list[i] = new Rect(i, i);

        for (int i = 0; i < list.length; i++) // 배열 요소 처리
            System.out.println(i + "번째" + list[i].getArea());

    }
}
