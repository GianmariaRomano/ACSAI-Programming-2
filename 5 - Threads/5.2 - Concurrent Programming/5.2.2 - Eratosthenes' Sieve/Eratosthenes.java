public class Eratosthenes {
    public static void main(String[] args) {
        EratoStation chain = new EratoStation(2);
        chain.start();
        try {
            for (int n = 3; n < 100; n++) {
                chain.pushBuffer(n);
            }
        } catch (InterruptedException e) {
            System.out.println("Shouldn't happen!");
        }
        chain.printList();
        chain.interrupt();
    }
}
