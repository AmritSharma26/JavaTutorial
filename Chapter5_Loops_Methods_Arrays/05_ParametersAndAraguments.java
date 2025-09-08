
class ParametersAndAraguments {

    public static void main(String[] args) {
        int sum = sumTwoNumbers(20, 50); // Arguments
        System.out.println("Sum : " + sum);
    }

    public static int sumTwoNumbers(int num1, int num2) { // Parameters
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);
        return num1 + num2;
    }
}
