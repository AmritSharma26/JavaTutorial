
import java.util.Scanner;

public class Challenge20AgeGroup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("you are a child.");
        } else if (age < 20) {
            System.out.println("Your are a teen.");
        } else if (age < 60) {
            System.out.println("You are a Adult");
        } else {
            System.out.println("Your are Senior");
        }
    }
}
