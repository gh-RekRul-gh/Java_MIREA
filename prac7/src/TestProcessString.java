import java.util.Scanner;

public class TestProcessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        ProcessString processString = new ProcessString(string);
        System.out.println("Inverted \"" + processString.getString() + "\" is \"" +
                processString.invertString() + "\"");
        System.out.println("String from odd characters of \"" + processString.getString() + "\" is \"" +
                processString.oddCharacters() + "\"");
        System.out.println("Enter a character you want to get number of in \"" + processString.getString() + "\"");
        char character = scanner.next().charAt(0);
        System.out.println("Number of character \"" + character + "\" in \"" + processString.getString() + "\" is " +
                processString.NumberOfCharacters(character));
    }
}
