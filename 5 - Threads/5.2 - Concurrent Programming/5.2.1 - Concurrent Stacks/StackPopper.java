public class StackPopper {
    private Stack S;
    public StackPopper(Stack S) {
        this.S = S;
    }
    public void run() {
        try {
            S.pop();
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }
}
