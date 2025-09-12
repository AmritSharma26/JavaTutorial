
import java.util.Scanner;

class MaxInArray {

    public static void main(String[] args) {
        int[] myArray = createArray();
        printArray(myArray);
        System.out.println("Maximum number is : " + maxInArray(myArray));
    }

    static int maxInArray(int[] myArray) {
        int maxElem = myArray[0];
        for (int elem : myArray) {
            if (elem > maxElem) {
                maxElem = elem;
            }
        }
        return maxElem;
    }

    static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = input.nextInt();

        int[] newArray = new int[size];

        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            newArray[i] = input.nextInt();
        }

        return newArray;
    }

    static void printArray(int[] myArray) {
        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
