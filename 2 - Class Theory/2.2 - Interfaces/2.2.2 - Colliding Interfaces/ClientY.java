public class ClientY implements ServerA, ServerB {
    // This class solves the conflict by providing a new implementation of the sigma method.
    public int sigma(int n) {
        return n - 4;
    }
}
