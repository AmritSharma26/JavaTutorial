
import java.util.Scanner;

public class Challenge24Compliment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.println(" ~" + num + " = " + (~num));
    }
}

// ~5 = ~(00000101) = 11111010 = 2's compliment of -6.
// if the MSB is 0 then its positive, convert directly.
// if the MSB is 1 then its negetive, find its 2's compliment.
