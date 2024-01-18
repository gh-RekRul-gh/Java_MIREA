import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> genericClass =
                new GenericClass<>(20, "approksimaciya", 1.5);
        genericClass.outputClassName();
    }
}
