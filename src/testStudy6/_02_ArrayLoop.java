package testStudy6;

public class _02_ArrayLoop {
    public static void main(String[] args) {

        // 배열의 순회
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        for (int i = 0; i < 4; i++) {  // 순서를 정하는 반족
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

System.out.println("============================");

        // 배열의 길이를 이용한 순회  
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

System.out.println("==============================");

        // for-each(enhanced) 반복문 -- 배열의 첨부터 끝까지 반복
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
System.out.println("주세요");




    } // main
}// class
