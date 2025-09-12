
import java.util.Scanner;

public class Challenge56ScoreCategorize {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = input.nextInt();
        scoreCategory(score);
    }

    static void scoreCategory(int score) {
        String scoreCat = score > 80 ? "High" : score < 50 ? "Low" : "Moderate";
        System.out.println("Your score category : " + scoreCat);
    }
}
