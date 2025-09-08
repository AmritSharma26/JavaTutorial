
public class Challenge47MergeSortedArray {

    public static void main(String[] args) {
        int[] firstArray = {3, 5, 7, 8, 12, 30, 40, 64};
        int[] secondArray = {2, 5, 9, 10, 33, 70};
        ArrayUtility.printArray(firstArray);
        ArrayUtility.printArray(secondArray);
        ArrayUtility.printArray(MergeSortedArray(firstArray, secondArray));
    }

    public static int[] MergeSortedArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, z = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[z++] = arr1[i++];
            } else {
                mergedArray[z++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArray[z++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[z++] = arr2[j++];
        }
        return mergedArray;
    }
}
