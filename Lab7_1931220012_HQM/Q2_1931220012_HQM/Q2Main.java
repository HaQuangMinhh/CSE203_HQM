
public class Q2Main {

    public static void main(String[] args) {
        // Factory Design Pattern

        // Demo 
        // Create factories -- có mấy cái cần dùng thì tạo bấy nhiêu  
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        // Create Shape của các đó 
        Shape circle = circleFactory.getShape();

        Shape rectangle = rectangleFactory.getShape();

        Shape square = squareFactory.getShape();

        // Gọi method draw từ các hình dạng
        circle.draw();
        rectangle.draw();
        square.draw();

    }

}
