
import java.util.Scanner;

public class Challenge48Search2DArray {

    public static void main(String[] args) {
        // int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] myArr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(myArr);
        int num = readNumber();
        int[] index = findElement2DArray(myArr, num);
        if (index[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println(num + " is at " + index[0] + "," + index[1]);
        }
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        return input.nextInt();
    }

    public static int[] findElement2DArray(int[][] arr, int num) {
        int i = 0, j = 0;
        while (i < arr.length) {
            j = 0;
            while (j < arr[i].length) {
                if (arr[i][j++] == num) {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        return new int[]{-1, -1};
    }
}
