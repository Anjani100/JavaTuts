import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "Who is the Yellow Flash of the leaf?";
        String op1 = "Naruto Uzumaki";
        String op2 = "Kakashi Hatake";
        String op3 = "Minato Namikaze";
        String op4 = "Eobard Thawne";
        String correctAnswer = op3;
        System.out.println(question);
        System.out.println("Your options are:");
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
        System.out.print("Pick an option (1/2/3/4): ");
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        if (op == 1 || op == 2 || op == 4 || op > 4 || op < 1)
            System.out.println("Incorrect Answer! The correct answer is " + op3);
        else
            System.out.println("Correct Answer! You are a fine shinobi.");
    }
}