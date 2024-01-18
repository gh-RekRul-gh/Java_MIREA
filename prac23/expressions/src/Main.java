import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5));

        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();

        // x^2 - 2x + 3
        System.out.println(
                new Add(
                        new Subtract(
                                new Variable("x", 2),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(3)
                ).evaluate(v)
        );
    }
}