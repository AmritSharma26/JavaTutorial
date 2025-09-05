
import java.util.Scanner;

public class Challenge12SI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of principal : ");
        float p = input.nextFloat();
        System.out.print("Enter rate of interest : ");
        float r = input.nextFloat();
        System.out.print("Enter value of time in years : ");
        float t = input.nextFloat();
        System.out.println("Simple Interest is : " + (p * r * t / 100));
    }
}
