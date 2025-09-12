
import java.util.Scanner;

class CalculatorSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter operation (+, -, *, /, %) : ");
        String operation = input.next();
        System.out.print("Enter second number : ");
        int second = input.nextInt();
        calculator(first, second, operation);
    }

    static void calculator(int num1, int num2, String operation) {
        Double result = switch (operation) {
            case "+" ->
                num1 + (double) num2;
            case "-" ->
                num1 - (double) num2;
            case "*" ->
                num1 * (double) num2;
            case "/" ->
                num2 != 0 ? num1 / (double) num2 : null;
            case "%" ->
                num1 % (double) num2;
            default ->
                null;
        };
        if (result != null) {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        } else {
            System.out.println("Invalid Operation.");
        }

    }
}
