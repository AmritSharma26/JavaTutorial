
import java.util.Scanner;

public class Challenge39Pattern {

    public static void main(String[] args) {
        int num = readNumber();
        printPattern1(num);
        printPattern2(num);
        printPattern3(num);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static void printPattern1(int n) {
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern2(int n) {
        while (n > 0) {
            int j = n;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            n--;
        }
    }

    public static void printPattern3(int n) {
        int i = 1;
        while (i <= n) {
            int j = i;
            while (n - j > 0) {
                System.out.print("  ");
                j++;
            }
            j = i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
