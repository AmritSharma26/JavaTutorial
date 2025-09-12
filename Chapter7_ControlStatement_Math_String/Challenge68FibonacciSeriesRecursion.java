
import java.util.Scanner;

class FibonacciSeriesRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print fibonacci series : ");
        int num = input.nextInt();
        fibonacciSeries(num);
    }

    static void fibonacciSeries(int num) {
        fibonacciSeries(num, 0, 1);
    }

    static void fibonacciSeries(int num, int prev, int curr) {
        if (prev + curr > num) {
            return;
        }
        System.out.print(curr + " ");
        fibonacciSeries(num, curr, prev + curr);
    }
}
