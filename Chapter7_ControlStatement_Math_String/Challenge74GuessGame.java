
import java.util.Scanner;

class GuessGame {

    int randomNum;
    int noOfguess;
    int userNum;
    int start;
    int end;

    public GuessGame(int start, int end, int noOfguess) {
        this.start = start;
        this.end = end;
        this.randomNum = setRandomNumber(start, end);
        this.noOfguess = noOfguess;
    }

    static int setRandomNumber(int start, int end) {
        int number = (int) (Math.random() * (end - start + 1)) + start;
        return number;
    }

    boolean isGuessLeft(int noOfguess) {
        if (noOfguess <= 0) {
            System.out.println("You have no more guesses left, better luck next time!!");
            return false;
        }
        System.out.println("You have " + noOfguess + " guesses left.");
        return true;
    }

    boolean isWin(int userNum, int randomNum) {
        if (userNum > randomNum) {
            System.out.println("You guessed higher.");
            return false;
        } else if (userNum < randomNum) {
            System.out.println("You gussed lower.");
            return false;
        }
        System.out.println("That Right, You Won!!");
        return true;
    }

    void play() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\t---Guessing Game---");
            do {
                System.out.printf("Guess a number (%d - %d) : ", this.start, this.end);
                this.userNum = input.nextInt();
                this.noOfguess--;

                if (isWin(this.userNum, this.randomNum)) {
                    break;
                }
                if (!isGuessLeft(this.noOfguess)) {
                    break;
                }

            } while (this.userNum != this.randomNum || this.noOfguess <= 0);
        }

    }

    public static void main(String[] args) {
        GuessGame game1 = new GuessGame(1, 100, 10);
        game1.play();
    }

}
