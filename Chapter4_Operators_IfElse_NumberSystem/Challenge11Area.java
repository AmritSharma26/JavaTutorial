
import java.util.Scanner;

public class Challenge11Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter breadth of triangle : ");
        float b = input.nextFloat();
        System.out.print("Enter height of trangle : ");
        float h = input.nextFloat();
        System.out.println("Area of triangle : " + (0.5 * b * h));
    }
}
