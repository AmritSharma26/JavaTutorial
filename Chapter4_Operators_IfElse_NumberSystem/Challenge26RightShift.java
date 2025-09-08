
import java.util.Scanner;

public class Challenge26RightShift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.println(num + " << 1" + " = " + (num << 1));
    }
}

// 5 << 1 = 00000101 << 1 = 00001010 = 10
// -5 << 1 = 11111011 << 1 = 11110110 = -10
// 10 << 3 = multiply by 2, 3 times = 10*2 = 20*2 = 40*2 = 80
