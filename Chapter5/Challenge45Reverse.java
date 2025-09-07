
public class Challenge45Reverse {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);
        reverseArray(arr);
        ArrayUtility.printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
            i++;
        }
    }
}
