public class Book implements Nameable, Priceable, Printable {
    private int price;
    private final String name;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void setPrice(int price) {
        this.price = price;
        System.out.println("Price of " + name + " has changed");
    }

    @Override
    public void getPrice() {
        System.out.println("Price of " + name + " is " + price);
    }
    @Override
    public void getName() {
        System.out.println("This book has name " + name);
    }

    @Override
    public void print() {
        System.out.println("Now " + name + " is printed");
    }
}
