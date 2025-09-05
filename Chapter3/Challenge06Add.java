
import java.util.Scanner;

class Challenge06Add {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = input.nextInt();
        System.out.printf("Sum of %d and %d id %d", a, b, a + b);
    }
}
