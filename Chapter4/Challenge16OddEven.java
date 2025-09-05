
import java.util.Scanner;

public class Challenge16OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is a Even number.");
        } else {
            System.out.println("This is a odd number.");
        }
    }
}
