
import java.util.Scanner;

class RelationalOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your age : ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Beta cycle chalao");
        }
    }
}
