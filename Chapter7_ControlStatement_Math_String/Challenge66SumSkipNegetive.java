
import java.util.Scanner;

class SumSkipNegetive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want to input : ");
        int noOfnums = input.nextInt();
        int positivesSum = 0;

        for (int i = 0; i < noOfnums; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = input.nextInt();
            if (num <= 0) {
                continue;
            }
            positivesSum += num;
        }
        System.out.println("Sum of all postive numbers : " + positivesSum);
    }
}
