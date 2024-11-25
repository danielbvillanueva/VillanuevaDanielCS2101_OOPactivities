public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(12, 16);
        Triangle triangle = new Triangle(15, 18, 22);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}