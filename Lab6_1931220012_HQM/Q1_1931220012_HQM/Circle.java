public class Circle implements Shape {

    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(Radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing the Circle with the radius: " + Radius);

    }

}
