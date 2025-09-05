
import java.util.Scanner;

public class Challenge07SwapAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = input.nextInt();
        System.out.print("Enter Value of B : ");
        int b = input.nextInt();

        System.out.println("A: " + a + " B : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a + " B : " + b);
    }
}
