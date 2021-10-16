import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Functions {
    public static double TotalMealCost(double mealPrice, double tipRate, double taxRate) {
//        double tip = tipRate * mealPrice;
//        double tax = taxRate * mealPrice;
//        double result = mealPrice + tip + tax;
//        return result;
        return (tipRate * mealPrice) + (taxRate * mealPrice) + mealPrice;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Meal Price: ");
        double mealPrice = input.nextDouble();
        System.out.print("Enter the Tip Rate: ");
        double tipRate = input.nextDouble();
        System.out.print("Enter the Tax Rate: ");
        double taxRate = input.nextDouble();
        System.out.println("Your meal costs " + TotalMealCost(mealPrice, tipRate, taxRate) + " rupees!");
    }
}
