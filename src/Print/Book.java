package Print;

public class Book implements Printable {

    private String bookName, bookAuthor;

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }


    public void print() {
        System.out.println("Name of the book: " + bookName);
        System.out.println("Name of the author: " + bookAuthor);
        System.out.println("");
    }

    static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book)
                System.out.println(((Book) printable[i]).bookName);
        }
    }
}

