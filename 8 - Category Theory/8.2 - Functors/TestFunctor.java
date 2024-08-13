import java.util.function.Function;

public class TestFunctor {
    static <T> void printLink(FunctorLink<T> l) {
        if (l == null) {
            System.out.println();
        } else {
            System.out.print(l.node + " ");
            printLink(l.next);
        }
    }
    public static void main(String[] args) {
        FunctorLink<Integer> I = new FunctorLink(5, new FunctorLink(8, new FunctorLink(12, new FunctorLink(7, new FunctorLink(1, new FunctorLink(26, new FunctorLink(44, null)))))));
        printLink(I);
        Function<Integer, Boolean> F = (Integer n) -> ( n % 4 == 0); // The function F checks whether an input integer is a multiple of 4 or not.
        FunctorLink<Boolean> B = I.fmap(F);
        printLink(B);
    }
}
