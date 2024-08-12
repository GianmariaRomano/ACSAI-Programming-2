public class StackPusher extends Thread {
    private Stack S;
    private int v;
    public StackPusher(Stack S, int v) {
        this.S = S;
        this.v = v;
    }
    public void run() {
        try {
            S.push(v);
        } catch (InterruptedException e) {
            System.out.println("... " + v);
        }
    }
}
