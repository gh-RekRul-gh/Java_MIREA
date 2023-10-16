public class Book implements Printable {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book book) {
                book.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Now book " + name + " is printed");
    }
}
