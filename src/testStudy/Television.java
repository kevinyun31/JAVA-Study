package testStudy;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    public Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    public static void main(String[] args) {
        Television my = new Television(7, 10, true);
        my.print();
        Television your = new Television(11, 20, true);
        your.print();
    }
}
