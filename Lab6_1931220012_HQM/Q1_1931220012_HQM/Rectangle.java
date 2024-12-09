public class Rectangle implements Shape {

    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double calculateArea() {
        return Width * Length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the Rectangle with the length: " + Length + ", the width: " + Width);

    }

}
