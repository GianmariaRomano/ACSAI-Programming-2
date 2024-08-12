public class ThreadTest {
    public static void main(String[] args) {
        // Start by creating the threads according to the two possible strategies.
        // 1) Extend the Thread class.
        MyThread T1 = new MyThread();
        T1.start();

        // 2) Implement the Runnable clas.
        MyRunnable r = new MyRunnable();
        Thread T2 = new Thread(r);
        T2.start();

        // Observe that concurrent programming is not deterministic, so the order of the actions may vary.
    }
}
