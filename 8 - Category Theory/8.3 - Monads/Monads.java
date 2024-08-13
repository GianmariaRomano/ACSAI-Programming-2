import java.util.Optional;

public class Monads {
    public static Optional<Double> divide(Double x, Double y) {
        // This is a new implementation of division, which, instead of raising an ArithmeticException, treats division by 0 as an empty reference.
        return (y == 0) ? Optional.empty() : Optional.of(x / y);
    }
    public static void main(String[] args) {
        System.out.println(divide(25.0, 7.0)); // Okay: expect 3.57.
        System.out.println(divide(25.0, 0.0)); // Okay: in this case, expect an empty reference.
    }
}
