
class Methods {

    public static void main(String[] args) {
        System.out.println("In main method");
        greeting();
        System.out.println("Method execution completed");
        printPatter();
        printPatter();

    }

    public static void greeting() {
        System.out.println("Good Morning");
    }

    public static void printPatter() {
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");

        int rows = 0;
        while (rows < 5) {
            int cols = rows;
            while (cols >= 0) {
                System.out.print("* ");
                cols--;
            }
            System.out.println();
            rows++;
        }
    }
}
