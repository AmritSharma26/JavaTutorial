
import java.util.Scanner;

public class Challenge30Factorial {

    public static void main(String[] args) {
        int n = readNumber();
        System.out.println(factorial(n));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static double factorial(int n) {
        double fact = 1;
        while (n > 0) {
            fact *= n--;
        }
        return fact;
    }
}
