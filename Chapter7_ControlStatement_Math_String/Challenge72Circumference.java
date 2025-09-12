
import java.util.Scanner;

class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 + Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double radius = input.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.printf("Circumference of circle : %.2fm", c1.getCircumference());
    }
}
