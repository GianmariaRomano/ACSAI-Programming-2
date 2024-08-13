public class AnnotatedStack {
    protected int[] stk;
    private int top = -1;
    AnnotatedStack(int l) {
        stk = new int[l];
    }
    @StackConsistency(condition = "-1 <= top <= stk.length - 1")
    public int size() {
        return stk.length;
    }
    public void push(int v) throws Exception {
        if (top == (stk.length - 1)) throw new Exception();
        top++;
        stk[top] = v;
    }
    public int pop() throws Exception {
        if (top < 0) throw new Exception();
        int h = stk[top];
        top--;
        return h;
    }
}
