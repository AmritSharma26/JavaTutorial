
class ForEachLoop {

    public static void main(String[] args) {
        String[] array = {"Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"};
        printArray(array);
    }

    public static void printArray(String[] array) {
        for (String elem : array) {
            System.out.print(elem + " ");
        }
    }
}
