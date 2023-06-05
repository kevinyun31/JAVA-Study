package ex04;

public class Gasoline {
    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = calcEffiency(gasoline, distance);
        System.out.printf("연비 : %2.f km/l", efficiency);
    }

    public static double calcEffiency(double fuel, double distance) {

        return distance / fuel;
        System.out.println(efficiency);
    }

}
