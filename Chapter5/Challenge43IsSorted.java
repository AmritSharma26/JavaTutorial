
public class Challenge43IsSorted {

    public static void main(String[] args) {
        int[] myArr = {2, 4, 6, 7, 23, 54};
        printArray(myArr);
        if (isSorted(myArr)) {
            System.out.println("Array is Sorted.");
        } else {
            System.out.println("Array is not Sorted.");
        }
    }

    public static void printArray(int[] arr) {
        int i = 0;
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println(']');
    }

    public static boolean isSorted(int[] arr) {
        int i = 0;
        if (arr.length == 0) {
            return false;
        }
        if (arr.length == 1) {
            return true;
        }
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
