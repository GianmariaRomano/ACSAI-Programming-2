public class WalkingDead extends Thread {
    // Two locks nested on different monitors.
    Object A, B;
    public WalkingDead(Object A, Object B) {
        this.A = A;
        this.B = B;
    }
    public void run() {
        synchronized(A) {
            /*
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
        }
        synchronized(B) {
            System.out.println(getName() + " joins the fight!");
        }
    }
}
