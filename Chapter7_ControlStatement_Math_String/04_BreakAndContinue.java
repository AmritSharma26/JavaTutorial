
class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; i < 1000; i++) {
            if (i == 101) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("Out of loop");

        System.out.println("Before loop");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("Out of loop");
    }
}
