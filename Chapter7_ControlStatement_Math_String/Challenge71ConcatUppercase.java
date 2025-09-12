
import java.util.Scanner;

class ConcatUppercase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = input.next();
        input.nextLine();
        System.out.print("Enter second string : ");
        String str2 = input.next();
        input.nextLine();

        String result = str1.concat(str2).toUpperCase();
        System.out.println(result);
    }
}
