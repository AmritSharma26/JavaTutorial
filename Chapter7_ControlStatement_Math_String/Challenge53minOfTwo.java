
import java.util.Scanner;

class minOfTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter second number : ");
        int second = input.nextInt();

        minOfTwo obj = new minOfTwo();
        System.out.println(obj.minimum(first, second) + " is the minimum");
    }

    int minimum(int first, int second) {
        return first < second ? first : second;
    }
}
