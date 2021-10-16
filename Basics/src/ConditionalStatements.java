import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fortune Teller!");
        System.out.print("Pick a number between 1 & 10 and I'll tell you your fortune: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice < 5)
            System.out.println("Enjoy the good luck a friend brings you!");
        else
            System.out.println("Your shoe selection will make you very happy today!");

        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing current song on loop!");
            System.out.print("Break the loop? If so, answer yes: ");
            String decision = input.next();
            if (decision.equals("yes"))
                isOnRepeat = false;
        }
        System.out.println("Playing next song!");
    }
}