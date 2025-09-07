
import java.util.Scanner;

public class Challenge33GCD {

    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();
        System.out.println("GCD of " + first + " and " + second + " = " + gcd(first, second));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            System.out.println(a + " % " + b + " = " + a % b);
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
