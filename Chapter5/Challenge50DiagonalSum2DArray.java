
public class Challenge50DiagonalSum2DArray {

    public static void main(String[] args) {
        int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(myArr);
        System.out.println("Sum of diagonal elements : " + diagonalSum(myArr));
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

    public static int diagonalSum(int[][] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (i == j) {
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
