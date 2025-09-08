
import java.util.Scanner;

class WhileLoop {

    public static void main(String[] args) {
        int num = 1;                    // Initilization
        while (num <= 10) {             // Condition
            System.out.print(num + " ");
            num = num + 1;              // Updation
        }
        System.out.println();

        int count = 50;
        while (count > 40) {
            System.out.print(count + " ");
            count -= 1;
        }

        System.out.println("\nEnter a Number");
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is " + inp);
            i++;
        }
    }
}
