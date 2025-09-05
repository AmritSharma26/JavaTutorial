
import java.util.Scanner;

class Challenge15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.print("Number is positive.");
        } else if (num < 0) {
            System.out.print("Number is negative.");
        } else {
            System.out.print("Number is Zero.");
        }
    }
}
