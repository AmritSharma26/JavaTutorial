
public class Challenge03Pattern {

    public static void main(String[] args) {

        // Pattern 1 Right Half Pyramid
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2 Reverse Right Half Pyramid
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3 Left Half Pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
