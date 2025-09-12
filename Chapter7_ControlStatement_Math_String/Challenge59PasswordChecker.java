
import java.util.Scanner;

class PasswordChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter your password : ");
            password = input.next();
        } while (!validatePassword(password));
    }

    static boolean validatePassword(String password) {
        if (password.length() < 5) {
            System.out.println("Password should be greater 5 letters.");
            return false;
        } else if (!passwordContainsSpecial(password)) {
            System.out.println("Password Should contain atleast 1 special Character.");
            return false;
        } else if (!passwordContainsNumber(password)) {
            System.out.println("Password should contain atleast 1 number");
            return false;
        }
        return true;
    }

    static boolean passwordContainsSpecial(String password) {
        String[] specialCharacters = {
            "!", "@", "#", "$", "%", "^", "&", "*", "(", ")",
            "-", "_", "=", "+", "[", "]", "{", "}", "\\", "|",
            ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?",
            "~", "`"
        };
        for (String specialChar : specialCharacters) {
            if (password.contains(specialChar)) {
                return true;
            }
        }
        return false;
    }

    static boolean passwordContainsNumber(String password) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String number : numbers) {
            if (password.contains(number)) {
                return true;
            }
        }
        return false;
    }
}
