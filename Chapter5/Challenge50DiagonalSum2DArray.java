
public class Challenge50DiagonalSum2DArray {

    public static void main(String[] args) {
        int[][] myArr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(myArr);
        System.out.println("Sum of diagonal elements : " + diagonalSum(myArr));
    }

    public static int diagonalSum(int[][] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[0].length) {
                if (i == j || i + j == arr[0].length - 1) {
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
