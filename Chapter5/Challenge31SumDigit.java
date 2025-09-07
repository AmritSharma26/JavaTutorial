
import java.util.Scanner;

public class Challenge31SumDigit {

    public static void main(String[] args) {
        int n = readNumber();
        System.out.println(sumDigit(n));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
