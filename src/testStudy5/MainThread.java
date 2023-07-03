package testStudy5;

class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadA:" + i);
        }
    }
}

class ThreadB implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadB:" + i);
        }
    }
}

public class MainThread {
    public static void main(String[] args) {

        ThreadA tha = new ThreadA();
        Thread thb = new Thread(new ThreadB());
        tha.start(); // 새로운 스레드로 시작 !!!!
        thb.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
    }
}
