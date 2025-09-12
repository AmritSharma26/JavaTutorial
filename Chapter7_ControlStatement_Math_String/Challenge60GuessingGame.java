
import java.util.Scanner;

class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = setRandomNumber(0, 100);
        int noOfguess = 10;
        int userNum;

        System.out.println("\t---Guessing Game---");
        do {
            System.out.print("Guess a number (0-100) : ");
            userNum = input.nextInt();
            noOfguess--;

            if (isWin(userNum, randomNum)) {
                break;
            }
            if (!isGuessLeft(noOfguess)) {
                break;
            }

        } while (userNum != randomNum || noOfguess <= 0);
    }

    static int setRandomNumber(int start, int end) {
        int number = (int) (Math.random() * (end - start + 1)) + start;
        return number;
    }

    static boolean isWin(int userNum, int randomNum) {
        if (userNum > randomNum) {
            System.out.println("You guessed higher.");
            return false;
        } else if (userNum < randomNum) {
            System.out.println("Ohhh no, you gussed lower.");
            return false;
        }
        System.out.println("That Right, You Won!!");
        return true;
    }

    static boolean isGuessLeft(int noOfguess) {
        if (noOfguess <= 0) {
            System.out.println("You have no more guesses left, better luck next time!!");
            return false;
        }
        System.out.println("You have " + noOfguess + " guesses left.");
        return true;
    }
}
