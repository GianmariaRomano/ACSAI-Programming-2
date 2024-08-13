import java.util.function.Function;

public class FunctorLink<T> implements Functor<T> {
    // The simplest example of a functor is given by the linked list data structure.
    public T node;
    public FunctorLink<T> next;
    public FunctorLink(T node, FunctorLink<T> next) {
        this.node = node;
        this.next = next;
    }
    public <R> FunctorLink<R> fmap(Function<T, R> f) {
        // This implementation of thee fmap() method will recursively create a functor of type R by applying f onto the input functor of type T.
        return new FunctorLink<R>(f.apply(node), (next == null) ? null : next.fmap(f));
    }
}
