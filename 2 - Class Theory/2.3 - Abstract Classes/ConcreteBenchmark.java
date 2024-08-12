public class ConcreteBenchmark extends Benchmark {
    public ConcreteBenchmark(int m) {
        super(m);
    }
    public void action() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("tic");
        }
    }
}
