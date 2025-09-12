
import java.util.Scanner;

class InputKeywords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyword;
        do {
            System.out.print("Enter your keyword : ");
            keyword = input.next();
            input.nextLine();
            System.out.println("Your keyword was " + keyword);
            if (keyword.equalsIgnoreCase("exit")) {
                break;
            }
        } while (true);

    }
}
