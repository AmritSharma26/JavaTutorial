
import java.util.Scanner;

public class Challenge28Table {

    public static void main(String[] args) {
        int n = readNumber();
        printTable(n);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static void printTable(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + n * i++);
        }
    }
}
