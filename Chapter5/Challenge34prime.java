
import java.util.Scanner;

public class Challenge34prime {

    public static void main(String[] args) {
        int num = readNumber();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                System.out.println(a + " % " + i + " = " + a % i);
                return false;
            }
            i++;
        }
        return true;
    }
}
