
import java.util.Scanner;

public class Challenge13CI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of principal : ");
        float p = input.nextFloat();
        System.out.print("Enter value of rate : ");
        float r = input.nextFloat();
        System.out.print("Enter value of time : ");
        float t = input.nextFloat();
        double amt = p * Math.pow((1 + r / 100), t);
        System.out.println("Amount is : " + amt);
        System.out.println("Compound Interest is : " + (amt - p));

    }
}
