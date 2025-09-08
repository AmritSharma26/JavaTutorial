
import java.util.Scanner;

class Return {

    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();
        System.out.println("Sum of " + first + " and " + second + " is " + (first + second));
    }

    public static void greet() {
        System.out.println("This is a calculator");
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }
}
