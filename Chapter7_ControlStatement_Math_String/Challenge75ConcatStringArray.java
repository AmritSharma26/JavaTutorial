
import java.util.Scanner;

class ConcatStringArray {

    public static void main(String[] args) {
        String[] names = createArray();
        System.out.println(concatStringArray(names));
    }

    static String concatStringArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String elem : array) {
            sb.append(elem).append(" ");
        }
        return sb.toString();
    }

    static String[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = input.nextInt();

        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter string %d : ", i);
            array[i] = input.next();
            input.nextLine();
        }
        return array;
    }

}
