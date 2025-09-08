
import java.util.Scanner;

public class Challenge44DelElem {

    public static void main(String[] args) {
        // int[] myArr = {2, 5, 6, 3, 2, 5, 8, 12};
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.printArray(myArr);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to delete : ");
        int num = input.nextInt();
        ArrayUtility.printArray(delElement(myArr, num));
    }

    public static int[] delElement(int[] arr, int num) {
        int occ = findOccurence(arr, num);
        if (occ == 0) {
            return arr;
        }
        int[] newArray = new int[arr.length - occ];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != num) {
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray;
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
