import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        var first = getInput();
        var second = getInput();
        System.out.println("The sum of 2 numbers: " + addValues(first, second));
        System.out.println("The sum of 4 numbers: " + addValues(first, second, first, second));
        System.out.println("The sum of 3 numbers: " + addValues(first, second, first));
    }

    public static double addValues(double first, double second) {
        return first + second;
    }

    public static double addValues(double first, double second, double third, double fourth) {
        return first + second + third + fourth;
    }

    public static double addValues(double ...values) {
        double result = 0;
        for (var value: values)
            result += value;
        return result;
    }

    public static double getInput() {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
