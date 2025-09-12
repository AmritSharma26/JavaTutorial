
import java.util.Scanner;

class IsPalindromeRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.next();
        input.nextLine();

        System.out.println(str + " is "
                + (isPalindrome(str) ? "Palindrome." : "not Palindrome."));
    }

    static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

}
