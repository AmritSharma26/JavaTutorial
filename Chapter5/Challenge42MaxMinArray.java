
public class Challenge42MaxMinArray {

    public static void main(String[] args) {
        // int[] myArr = {4, 2, 6, 23, 62, 23, 43, 6};
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.printArray(myArr);
        System.out.println("Greatest element in array : " + maxArray(myArr));
        System.out.println("Smallest element in array : " + minArray(myArr));
    }

    public static int maxArray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int minArray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int min = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
