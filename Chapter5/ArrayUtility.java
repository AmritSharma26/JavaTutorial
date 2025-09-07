
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        int size = readSize();
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + i + " : ");
            arr[i++] = input.nextInt();
        }
        return arr;
    }

    public static int readSize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of Array : ");
        return input.nextInt();
    }

    public static void printArray(int[] arr) {
        int i = 0;
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println(']');
    }
}
