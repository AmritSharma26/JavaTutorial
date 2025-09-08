
import java.util.Scanner;

public class Challenge36Fibonacci {

    public static void main(String[] args) {
        int n = readNumber();
        fibonacciSeries(n);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static void fibonacciSeries(int n) {
        int prev = 0;
        int curr = 1;
        int i = 0;
        if (n > 0) {
            System.out.print("0 ");
        }
        while (curr < n) {
            System.out.print(curr + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
            i++;
        }
    }
}
