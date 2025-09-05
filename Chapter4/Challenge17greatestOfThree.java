
import java.util.Scanner;

public class Challenge17greatestOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = input.nextInt();
        int greatest = num1;

        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        System.out.println(greatest + " is the largest Number.");
    }
}
