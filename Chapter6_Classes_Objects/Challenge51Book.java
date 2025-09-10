
public class Challenge51Book {

    static int totalBooks = 0;

    String title;
    String author;
    String isbn;
    boolean isborrowed;

    Challenge51Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        System.out.println(this.title + " by " + this.author + " added to library.");
        totalBooks += 1;
    }

    Challenge51Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (!this.isborrowed) {
            System.out.println(this.title + " Borrowed.");
            this.isborrowed = true;
            totalBooks -= 1;
        } else {
            System.out.println(this.title + " is already borrowed.");
        }
    }

    void returnBook() {
        if (this.isborrowed) {
            System.out.println(this.title + " Returned.");
            totalBooks += 1;
            this.isborrowed = false;
        } else {
            System.out.println("Can't be returned");
        }
    }

    public static void main(String[] args) {
        Challenge51Book newBook = new Challenge51Book("123", "One Piece", "Oda");
        Challenge51Book newBook2 = new Challenge51Book("456");
        System.out.println(Challenge51Book.totalBooks);

        newBook.borrowBook();
        newBook.borrowBook();
        System.out.println(Challenge51Book.getTotalBooks());
        newBook2.returnBook();
        newBook.returnBook();
        System.out.println(Challenge51Book.getTotalBooks());
    }

}
