public class MyStack {
    protected int[] stk;
    private int top = -1;
    MyStack(int l) {
        stk = new int[l];
    }
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
