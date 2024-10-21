
public class Area {

    public static double CalculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double CalculateArea(double width, int length) {
        return width * length;
    }

    public static double CalculateArea(double radius, double height) {
        return Math.PI * (radius * radius) * height;
    }

}
