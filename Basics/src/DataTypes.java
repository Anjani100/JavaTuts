import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int studentAge = 21;
        double studentGPA = 8.42;
//        char firstInitial = 'B';
//        char lastInitial = 'A';
        boolean hasPerfectAttendance = false;
        String firstName = "Barry";
        String lastName = "Allen";
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(firstInitial);
        System.out.println(lastInitial);
        System.out.println(hasPerfectAttendance);
//        System.out.println(firstName + " " + lastName + " has a GPA of " + studentGPA);
        System.out.print("Do you want to update your GPA: ");
        Scanner input = new Scanner(System.in);
        String decision = input.next().toLowerCase();
        if (decision.equals("yes")) {
            System.out.println("Enter the updated value: ");
            double updatedGPA = input.nextDouble();
            studentGPA = updatedGPA;
        }
        System.out.println(firstName + " " + lastName + " has a GPA of " + studentGPA);
    }
}