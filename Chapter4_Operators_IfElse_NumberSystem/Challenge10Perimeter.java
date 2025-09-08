
import java.util.Scanner;

public class Challenge10Perimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of side A or C: ");
        float a = input.nextFloat();
        System.out.print("Enter value of side B or D : ");
        float b = input.nextFloat();
        System.out.println("Perimeter of Rectangle ABCD : " + (2 * (a + b)));
    }
}
