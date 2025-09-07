
import java.util.Scanner;

public class Challenge38Palindrome {

    public static void main(String[] args) {
        int num = readNumber();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int reverseDigit(int n) {
        int revNum = 0;
        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        return revNum;
    }

    public static Boolean isPalindrome(int num) {
        return num == reverseDigit(num);
    }
}
