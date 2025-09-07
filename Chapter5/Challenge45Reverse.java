
public class Challenge45Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int i = 0;
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println(']');
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
