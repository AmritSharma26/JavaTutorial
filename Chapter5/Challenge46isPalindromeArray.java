
public class Challenge46isPalindromeArray {

    public static void main(String[] args) {
        // int[] myArr = {1, 2, 3, 2, 1};
        int[] myArr = ArrayUtility.inputArray();
        ArrayUtility.printArray(myArr);
        if (isPalindromeArray(myArr)) {
            System.out.println("Array is a Palindrome.");
        } else {
            System.out.println("Array is not a Palindrome.");
        }
    }

    public static boolean isPalindromeArray(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - (i + 1)]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
