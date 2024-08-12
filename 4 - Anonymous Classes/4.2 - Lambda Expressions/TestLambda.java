public class TestLambda {
    /*
    Another way of creating anonymous classes is via lambda expressions, which, however, tend to be used more to provide quick implementations of functional interfaces.
    In this case, it's possible to use the syntax (parameters) -> {output};.
     */
    public static Lambda doubler = (String s) -> (s + s); // This lambda expression implements lambdaWrite(s) so that it returns s + s.
    public static Lambda three = (String s) -> (s.substring(0, 3)); // This lambda expression implements lambdaWrite(s) so that it returns the first three characters of s.
    public static void surprise(Lambda F) {
        System.out.println(F.lambdaWrite("lambda"));
    }
    public static void main(String[] args) {
        System.out.println(doubler.lambdaWrite("hello"));
        System.out.println(three.lambdaWrite("hello"));
        surprise((String s) -> "Alonzo Church"); // This command will execute the behaviour of the input expression, which implements lambdaWrite(s) to always return "Alonzo Church" as the output.
        surprise(three); // This command will execute the behaviour of the input expression, therefore returning the string "lam" as the output.
    }
}
