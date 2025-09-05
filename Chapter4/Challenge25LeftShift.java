
import java.util.Scanner;

public class Challenge25LeftShift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.println(num + " >> 1" + " = " + (num >> 1));
    }
}

// 5 >> 1 = 00000101 >> 1 = 00000010 = 3
// 10 >> 3 = divide by 2, 3 times = 10/2 = 5/2 = 2/2 = 1
