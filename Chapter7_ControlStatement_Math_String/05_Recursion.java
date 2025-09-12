
import java.util.Scanner;

class Recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();

        System.out.println("Factorial of the number is : " + factorial(num));
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
