
import java.util.Scanner;

public class Challenge55absolute {

    public static void main(String[] args) {
        int num = readNumber();
        System.out.println(absolute(num));
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        return input.nextInt();
    }

    static int absolute(int num) {
        return num >= 0 ? num : -num;
    }
}
