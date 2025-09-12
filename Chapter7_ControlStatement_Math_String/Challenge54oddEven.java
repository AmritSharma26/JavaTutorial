
import java.util.Scanner;

public class Challenge54oddEven {

    public static void main(String[] args) {
        int num = readNumber();
        isOddEven(num);
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        return input.nextInt();
    }

    static void isOddEven(int num) {
        String oddEven = num % 2 == 0 ? "even" : "odd";
        System.out.println(num + " is a " + oddEven + " number.");
    }
}
