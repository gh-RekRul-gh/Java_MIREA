public class NotSolvableException extends Exception {
    public NotSolvableException() {
        super("This statement is not solvable, try rewrite it. Keep in mind that this is the Polish notation");
    }
}