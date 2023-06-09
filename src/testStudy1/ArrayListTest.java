package testStudy1;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("부산");
        list.add("서울");
        list.add("일본");
        list.add("호주");
        list.add("괌");

        System.out.println("여행지 추천 내가 가라는 곳에 가라");
        int index = (int) (Math.random() * list.size());
        System.out.println("니가 갈 곳은 " + list.get(index) + "이다");
        System.out.println("내가 고른 여행지다 악으로 즐겨라~~ㅋㅋㅋ!!");
    }
}
