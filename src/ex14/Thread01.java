package ex14;

public class Thread01 {

    // cpu가 하나의 스레드를 생성하여 실행된다.
    // 실 == main 메서드 이다. body의 크기에 따라 길이가 바뀜.

    public static void main(String[] args) {

        new Thread(() -> { // 타겟 == 스레드의 길이
            for (int i = 0; i < 5; i++) {
                System.out.println("메인스레드 : " + i);

                try {
                    Thread.sleep(1000); // 1000 == 1초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인스레드 : " + i);

            try {
                Thread.sleep(1000); // 1000 == 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}