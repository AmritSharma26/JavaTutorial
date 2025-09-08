
import java.util.Scanner;

class LearningArray {

    public static void main(String[] args) {

        // Array Initialization
        // int[] myArr = new int[5];
        // myArr[0] = 98;
        // myArr[3] = 62;
        // myArr[1] = 2;
        // myArr[2] = 8;
        // myArr[4] = 37;
        int[] myArr = {98, 2, 8, 62, 37};

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);
        // Array Traversal
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

        // Array Searching
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 5, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("Welcome to array search");
        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();
        if (isFound(arr, num)) {
            System.out.println("your number was found.");
        } else {
            System.out.println("Your number was not found.");
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);

    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
