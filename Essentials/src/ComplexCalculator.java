import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = getInput(input);
        double second = getInput(input);
        double result = -1;
        System.out.print("Select an operation (+ - * /): ");
        boolean flag;
        do {
            String op = input.next();
            flag = false;
            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
                default:
                    System.out.println("Invalid Choice, pick again");
                    flag = true;
                    break;
            }
        } while (flag);
        System.out.println("Result: " + result);
    }

    public static double getInput(Scanner input) {
        double val = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                val = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Not a valid value! Pick again...");
                input.next();
            }
        }
        return val;
    }
}