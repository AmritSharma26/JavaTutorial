
import java.util.Scanner;

public class Challenge29SumOddN {

    public static void main(String[] args) {
        int n = readNumber();
        System.out.println(sumOddN(n));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int sumOddN(int n) {
        int i = 1;
        int oddSum = 0;
        while (i <= n) {
            oddSum += i;
            i += 2;
        }
        return oddSum;
    }
}
