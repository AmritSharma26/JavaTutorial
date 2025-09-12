
import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print a table : ");
        int num = input.nextInt();
        printTable(num);
    }

    static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
