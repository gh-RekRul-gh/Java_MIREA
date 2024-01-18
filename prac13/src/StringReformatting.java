import java.util.Locale;
import java.util.Scanner;
public class StringReformatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string");
        String str = scanner.nextLine();
        doReformatting(str);

    }
    private static void doReformatting(String str) {
        int n = str.length();
        System.out.println("Last symbol is " + str.charAt(n - 1));
        if (str.endsWith("!!!"))
            System.out.println("It ends with '!!!'");
        if (str.startsWith("I like"))
            System.out.println("It starts with 'I like'");
        int ind = str.indexOf("Java");
        if (str.contains("Java")) {
            System.out.println("It contains 'Java'");
            System.out.println("Pos of 'Java' substring is [" + (ind + 1) + ", " + (ind + 5) + "]");
        }
        str = str.replace('a', 'o');
        System.out.println("String after replacing a to o is " + str);
        str = str.toUpperCase(Locale.ROOT);
        System.out.println("String in upper case is " + str);
        str = str.toLowerCase();
        System.out.println("String in lower case is " + str);
        str = str.substring(0, ind) + str.substring(ind + 4, n);
        System.out.println("String after erasing 'Java' is " + str);
    }
}
