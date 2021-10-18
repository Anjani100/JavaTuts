import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = getInput(input);
        double second = getInput(input);
        System.out.println("Result: " + first / second);
    }

    public static double getInput(Scanner input) {
        System.out.print("Enter a numeric value: ");
        return input.nextDouble();
    }
}
