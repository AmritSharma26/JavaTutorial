
import java.util.Scanner;

class Dice {

    void rollDice() {
        int diceNum = (int) Math.floor(Math.random() * 6 + 1);
        System.out.println("Dice got : " + diceNum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dice dice = new Dice();
        do {
            System.out.print("Enter 1 to roll dice : ");
            if (input.nextInt() != 1) {
                break;
            }
            dice.rollDice();
        } while (true);
    }

}
