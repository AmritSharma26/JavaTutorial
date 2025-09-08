
import java.util.Scanner;

public class Challenge09Product {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = input.nextFloat();
        System.out.print("Enter second number : ");
        float b = input.nextFloat();
        System.out.print("Product of " + a + " and " + b + " is " + (a * b));
    }
}
