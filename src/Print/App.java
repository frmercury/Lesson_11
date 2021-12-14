package Print;

public class App {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("RoundUp", "Virginia Evans");
        printables[1] = new Book("Harry Potter", "J. Rowling");
        printables[2] = new Magazine("Man'sHealth", "Ron Wesley");
        printables[3] = new Magazine("Cosmopolitan", "Sara Parker");

        getPrint(printables);
        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }

    public static void getPrint (Printable[] printable) {
        for (Printable pr: printable) {
            pr.print();
        }
    }
}

