package ex04;

public class Zzz {
    private int channel;
    private int volume;
    private boolean isOn;

    Zzz(int c, int v, boolean o) {
        channel = c;
        volume = v;
        isOn = o;
    }

    void print() {
        System.out.println("채널" + channel + "볼륨" + volume + "이다.");
    }
}
