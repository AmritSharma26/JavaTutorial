
import java.util.Scanner;

public class Challenge35ReverseDigit {

    public static void main(String[] args) {
        int num = readNumber();
        System.out.println(reverseDigit(num));
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

}
