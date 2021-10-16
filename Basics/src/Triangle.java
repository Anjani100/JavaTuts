public class Triangle {
    static int numOfSides = 3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // Instance Method
    public double findArea() {
        return 0.5 * this.base * this.height;
    }

    // Class Method
    public static double findArea(double base, double height) {
        return 0.5 * base * height;
    }
}