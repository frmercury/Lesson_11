package Print;

public class Magazine implements Printable {

    private String mName, mTheme;

    public Magazine(String mName, String mTheme) {
        this.mName = mName;
        this.mTheme = mTheme;
    }


    public void print() {
        System.out.println("Name of the book: " + mName);
        System.out.println("Magazine main theme: " + mTheme);
        System.out.println("");
    }

    static void printMagazines(Printable[] printable) {
            for (int i = 0; i < printable.length; i++) {
                if (printable[i] instanceof Magazine)
                    System.out.println((((Magazine) printable[i]).mName));
            }
        }
    }
