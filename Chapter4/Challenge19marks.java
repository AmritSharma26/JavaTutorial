
import java.util.Scanner;

public class Challenge19marks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = input.nextInt();

        if (marks > 100) {
            System.out.println("Please enter valid marks.");
        } else if (marks > 90) {
            System.out.println("Your grade is A.");
        } else if (marks > 75) {
            System.err.println("Your grade is B");
        } else if (marks > 60) {
            System.out.println("Your grade is C");
        } else if (marks > 30) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
