
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + i + " : ");
            arr[i++] = input.nextInt();
        }
        return arr;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter number of cols : ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print("Enter element (" + i + ", " + j + ") : ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        int i = 0;
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println(']');
    }

    public static void print2DArray(int[][] arr) {
        int i = 0, j = 0;
        System.out.println("[ ");
        while (i < arr.length) {
            System.out.print("[ ");
            j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j++] + " ");
            }
            System.out.println("] ");
            i++;
        }
        System.out.println("] ");
    }
}
