
import java.util.Scanner;

public class Challenge23XOR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));
    }
}

// 5 ^ 6 = 101 ^ 110 = 011 = 3
