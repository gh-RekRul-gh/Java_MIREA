import java.util.Scanner;
import java.util.regex.Pattern;

public class Eshop {
    static boolean isCorrectINN(String TIN){
        if(TIN.length()!=12)
            return false;
        return Pattern.matches("\\d{12}", TIN);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullname = scanner.nextLine();
        System.out.print("Enter TIN: ");
        try {
            String TIN = scanner.next();
            if (!isCorrectINN(TIN))
                throw new TINException("Wrong TIN entered");
            else System.out.println("Enjoy your buyings");
        } catch (TINException e){
            System.out.println(e.getMessage());
        }
    }
}