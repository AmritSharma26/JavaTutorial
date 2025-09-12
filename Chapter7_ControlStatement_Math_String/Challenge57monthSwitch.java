
import java.util.Scanner;

public class Challenge57monthSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month of the year : ");
        int monthNum = input.nextInt();
        if (monthOfYear(monthNum) != null) {
            System.out.println("Your month is " + monthOfYear(monthNum));
        }
    }

    static String monthOfYear(int monthNum) {
        String monthName = switch (monthNum) {
            case 1 ->
                "January";
            case 2 ->
                "February";
            case 3 ->
                "March";
            case 4 ->
                "April";
            case 5 ->
                "May";
            case 6 ->
                "June";
            case 7 ->
                "July";
            case 8 ->
                "August";
            case 9 ->
                "September";
            case 10 ->
                "October";
            case 11 ->
                "November";
            case 12 ->
                "December";
            default ->
                null;
        };
        return monthName != null ? monthName : null;
    }

    // static String monthOfYearold(int monthNum) {
    //     String monthName;
    //     switch (monthNum) {
    //         case 1:
    //             monthName = "January";
    //             break;
    //         case 2:
    //             monthName = "February";
    //             break;
    //         case 3:
    //             monthName = "March";
    //             break;
    //         case 4:
    //             monthName = "April";
    //             break;
    //         case 5:
    //             monthName = "May";
    //             break;
    //         case 6:
    //             monthName = "June";
    //             break;
    //         case 7:
    //             monthName = "July";
    //             break;
    //         case 8:
    //             monthName = "August";
    //             break;
    //         case 9:
    //             monthName = "September";
    //             break;
    //         case 10:
    //             monthName = "October";
    //             break;
    //         case 11:
    //             monthName = "Novermber";
    //             break;
    //         case 12:
    //             monthName = "December";
    //             break;
    //         default:
    //             monthName = null;
    //     }
    //     return monthName;
    // }
}
