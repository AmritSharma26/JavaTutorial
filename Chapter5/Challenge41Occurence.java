
import java.util.Scanner;

public class Challenge41Occurence {

    public static void main(String[] args) {
        // int[] arr = {5, 34, 54, 2, 6, 5, 54, 5, 3};
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);
        int num = readNumber();
        System.out.println(num + "'s occurence in array : " + findOccurence(arr, num));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int findOccurence(int[] arr, int num) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i++] == num) {
                count++;
            }
        }
        return count;
    }
}
