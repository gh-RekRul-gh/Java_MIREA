public class Magazine implements Printable {
    private final String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine magazine) {
                magazine.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Now magazine " + name + " is printed");
    }
}
