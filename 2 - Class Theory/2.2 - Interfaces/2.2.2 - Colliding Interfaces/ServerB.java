public interface ServerB {
    // This is an interface providing a default implementation of the method sigma which, given an input n, returns its factorial.
    default int sigma(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
}
