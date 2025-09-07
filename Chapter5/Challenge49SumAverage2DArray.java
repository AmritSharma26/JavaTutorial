
public class Challenge49SumAverage2DArray {

    public static void main(String[] args) {
        int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(myArr);
        System.out.println("Sum of Elements of 2D Array : " + sum2DArray(myArr));
        System.out.printf("Average of elements of 2D Array : %.2f", average2DArray(myArr));
    }

    public static void print2DArray(int[][] arr) {
        int i = 0;
        System.out.println("[ ");
        while (i < arr.length) {
            System.out.print("[ ");
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j++] + " ");
            }
            System.out.println("] ");
            i++;
        }
        System.out.println("] ");
    }

    public static int sum2DArray(int[][] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j++];
            }
            i++;
        }
        return sum;
    }

    public static float average2DArray(int[][] myArr) {
        float numOfElem = coutElem2DArray(myArr);
        return sum2DArray(myArr) / numOfElem;
    }

    public static int coutElem2DArray(int[][] arr) {
        int i = 0, count = 0;
        while (i < arr.length) {
            int j = 0;
            while (j++ < arr[i].length) {
                count++;
            }
            i++;
        }
        return count;
    }
}
