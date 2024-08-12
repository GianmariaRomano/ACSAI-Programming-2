public class SynchronizedStack implements Stack {
    private int[] stk;
    private int top = -1;
    SynchronizedStack(int l) {
        stk = new int[l];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == (stk.length - 1);
    }
    public synchronized void push(int v) throws InterruptedException {
        while (isFull()) {
            // Since the stack is full, the thread will wait until some space will be free.
            wait();
        }
        System.out.println("Currently pushing value " + v);
        top++;
        stk[top] = v;
        notifyAll(); // Since this thread managed to place a value, any thread that was paused might have the chance to do the same.
    }
    public synchronized int pop() throws InterruptedException {
        while (isEmpty()) {
            // Since the stack is empty, the thread will wait until there is a value to pop.
            wait();
        }
        int h = stk[top];
        System.out.println("Currently popping value " + h);
        top--;
        notifyAll(); // Since this thread managed to place a value, any thread that was paused might have the chance to do the same.
        return h;
    }
}
