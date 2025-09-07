
public class Challenge43IsSorted {

    public static void main(String[] args) {
        // int[] myArr = {2, 4, 6, 7, 23, 54};
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.printArray(myArr);
        if (isIncreasing(myArr) || isDecreasing(myArr)) {
            System.out.println("Array is Sorted.");
        } else {
            System.out.println("Array is not Sorted.");
        }
    }

    public static boolean isIncreasing(int[] arr) {
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

    public static boolean isDecreasing(int[] arr) {
        int i = 0;
        if (arr.length == 0) {
            return false;
        }
        if (arr.length == 1) {
            return true;
        }
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
