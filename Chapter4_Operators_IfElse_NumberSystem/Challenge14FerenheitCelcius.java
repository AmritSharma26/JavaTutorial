
import java.util.Scanner;

public class Challenge14FerenheitCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in ferenheit : ");
        float f = input.nextFloat();
        System.out.println(f + " F " + " = " + ((f - 32) * 5 / 9) + " C");
    }
}
