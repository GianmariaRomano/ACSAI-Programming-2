public class ClientX implements ServerA, ServerB {
    // This class solves the conflict by explicitly choosing the method implementation provided by one interface.
    public int sigma(int n) {
        return ServerA.super.sigma(n);
    }
}
