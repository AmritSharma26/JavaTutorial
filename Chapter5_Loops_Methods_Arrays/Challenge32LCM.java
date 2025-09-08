
import java.util.Scanner;

public class Challenge32LCM {

    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();

        System.out.println("LCM of " + first + " and " + second + " = "
                + lcm(first, second));
        System.out.println("LCM of " + first + " and " + second + " = "
                + lcm2(first, second));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int lcm2(int a, int b) {
        int i = 1;
        int curr = a;
        while (curr % b != 0) {
            curr = a * ++i;
        }
        return curr;
    }
}
