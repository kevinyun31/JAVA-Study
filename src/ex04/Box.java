package ex04;

public class Box {
    int width, height = 50;
    int depth = 100;
}

class BoxTeat {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("(" + b.width + "," + b.height + "," + b.depth + ")");
    }
}