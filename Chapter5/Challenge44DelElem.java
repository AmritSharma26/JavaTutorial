
public class Challenge44DelElem {

    public static void main(String[] args) {
        int[] myArr = {2, 5, 6, 3, 2, 5, 8, 12};
        printArray(myArr);
        printArray(delElement(myArr, 2));
    }

    public static void printArray(int[] arr) {
        int i = 0;
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }
        System.out.println(']');
    }

    public static int[] delElement(int[] arr, int num) {
        int[] newArray = new int[arr.length - findOccurence(arr, num)];
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
