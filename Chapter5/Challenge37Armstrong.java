
import java.util.Scanner;

public class Challenge37Armstrong {

    public static void main(String[] args) {
        int num = readNumber();
        if (isArmstrong(num)) {
            System.out.println(num + " is a Armstrong Number.");
        } else {
            System.out.println(num + " is not a Armstrong Number.");
        }
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static Boolean isArmstrong(int n) {
        int noDigits = noOfDigits(n);
        int armstrongNum = 0;
        int num = n;
        while (num > 0) {
            armstrongNum += power(num % 10, noDigits);
            num /= 10;
        }
        return armstrongNum == n;
    }

    public static int noOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int n, int p) {
        int res = 1;
        while (p > 0) {
            res *= n;
            p--;
        }
        return res;
    }
}
