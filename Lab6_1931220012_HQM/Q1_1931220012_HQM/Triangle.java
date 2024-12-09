public class Triangle implements Shape {

    private double Base;
    private double Height;

    public Triangle(double base, double height) {
        Base = base;
        Height = height;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * Height * Base;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the triangle with Base: " + Base + ", The height: " + Height);

    }

}
