import java.util.function.Function;

public class Functions {
    // By importing the java.util.function.Function package, it's possible to access the Function<T,R> interface, which represents a function going from an input class T to an output class R.
    public static void main(String[] args) {
        int n = 7;

        Function<Integer, Integer> next = (x) -> (x + 1);
        System.out.println(next.apply(n)); // The apply() method basically executes f(x).
        Function<Integer, Integer> square = (x) -> (x * x);
        System.out.println(square.apply(n));

        // Given g:A->B and f:B->C, the compose() method creates a function h:A->C given by h(x) = f(g(x)).
        Function<Integer, Integer> squarenext = next.compose(square); // h(x) = (x ** 2) + 1
        System.out.println(squarenext.apply(n));

        // Given f:A->B and g:B->C, the andThen() method creates a function h:A->C given by h(x) = g(f(x)).
        Function<Integer, Integer> nextsquare = next.andThen(square); // h(x) = (x + 1) ** 2
        System.out.println(nextsquare.apply(n));

        // The identity() method acts as an identity function, always returning its input.
        System.out.println((Function.identity()).apply(n));
        System.out.println((Function.identity()).apply("this is an identity function"));
    }
}
