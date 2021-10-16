public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10, 12.5, 13, 10, 25);
        Triangle triangle2 = new Triangle(12, 5, 12, 5, 13);
        // Instance Method
        System.out.println(triangle1.findArea());
        System.out.println(triangle2.findArea());
        // Class Method
        System.out.println(Triangle.findArea(12, 5));
        // Instance Variables
        System.out.println(triangle1.base);
        // Class Variables
        System.out.println(Triangle.numOfSides);
    }
}