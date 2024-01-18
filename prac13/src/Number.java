import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите номер в формате
                +<Код страны><Номер 10 цифр>
                или
                8<Номер 10 цифр>""");
        String str = scanner.next();
        int n = str.length();
        if (n == 11)
            System.out.println("+7" + str.substring(1, 4) + "-" + str.substring(4, 7) + "-" + str.substring(7, 11));
        else {
            System.out.println("+" + str.substring(1, n - 10) + str.substring(n - 10, n - 7) + "-" +
                    str.substring(n - 7, n - 4) + "-" + str.substring(n - 4, n));
        }
    }
}
