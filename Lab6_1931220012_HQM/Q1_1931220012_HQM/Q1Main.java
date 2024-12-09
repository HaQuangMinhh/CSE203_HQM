public class Q1Main {

    public static void main(String[] args) {

        Shape circle = new Circle(4.5);

        Shape rectangle = new Rectangle(1.5, 2.5);

        Shape triangle = new Triangle(3.5, 2.5);

        // Draw and Calculate
        System.out.println("-------------------------Circle---------------------------");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("-------------------------Rectangle---------------------------");
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());

        System.out.println("-------------------------triangle---------------------------");
        triangle.draw();
        System.out.println("Area: " + triangle.calculateArea());

    }
}
