public interface ServerA {
    // This is an interface providing a default implementation of the method sigma which, given an input n, returns the sum of all numbers from 1 to n.
    default int sigma(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
