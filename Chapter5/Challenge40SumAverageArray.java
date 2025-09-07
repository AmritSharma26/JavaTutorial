
public class Challenge40SumAverageArray {

    public static void main(String[] args) {
        // int[] myArr = {8, 3, 6, 3, 5, 23, 12};
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.printArray(myArr);
        System.out.println("Sum of array : " + sumArray(myArr));
        System.out.printf("Average of array : %.2f", arrAverage(myArr));
    }

    public static int sumArray(int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i++];
        }
        return sum;
    }

    public static float arrAverage(int[] arr) {
        return sumArray(arr) / (float) arr.length;
    }
}
