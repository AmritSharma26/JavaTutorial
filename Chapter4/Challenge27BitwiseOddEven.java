
import java.util.Scanner;

public class Challenge27BitwiseOddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if ((num & 1) == 0) {
            System.out.print("Its a even number.");
        } else {
            System.out.println("Its a odd number.");
        }
    }
}
