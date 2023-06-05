package ex04;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    public String color; // 색상

    // 면적
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
