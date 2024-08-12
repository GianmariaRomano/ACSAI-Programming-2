public class DeadLock {
    // This program results in a deadlock because the objects try to get their keys but do so at different times due to the sleep method.
    public static void main(String[] args) {
        Object m1 = new Object();
        Object m2 = new Object();

        WalkingDead Z1 = new WalkingDead(m1, m2);
        Z1.setName("ONE");

        WalkingDead Z2 = new WalkingDead(m2, m1);
        Z2.setName("TWO");

        Z1.start();
        Z2.start();
    }
}
