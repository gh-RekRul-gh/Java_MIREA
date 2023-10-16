public class TestMagazinesAndBooks {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[5];
        printableArray[0] = new Book("Harry Potter");
        printableArray[1] = new Magazine("Forbes");
        printableArray[2] = new Book("Pirates of the Cat sea");
        printableArray[3] = new Magazine("Magazine 2");
        printableArray[4] = new Book("Book 3");
        Book.printBooks(printableArray);
        Magazine.printMagazines(printableArray);
    }
}
