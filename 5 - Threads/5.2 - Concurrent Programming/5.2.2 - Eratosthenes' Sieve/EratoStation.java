public class EratoStation extends Thread {
    public int head;
    public EratoStation tail;
    public EratoStation(int head) {
        this.head = head;
        this.tail = null;
    }
    public synchronized void insert(EratoStation e) {
        int n = e.head;
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Pushing value " + n);
            concatenate(e);
        }
    }
    public synchronized void concatenate(EratoStation e) {
        if (tail == null) {
            this.tail = e;
        } else {
            tail.concatenate(e);
        }
    }
    public synchronized void run() {
        try {
            if (isInterrupted()) throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println();
        }
    }
    public synchronized void pushBuffer(int n) throws InterruptedException {
        EratoStation number = new EratoStation(n);
        insert(number);
    }
    public void printList() {
        if (tail == null) {
            System.out.println(head);
        } else {
            System.out.print(head + " ");
            tail.printList();
        }
    }
}
