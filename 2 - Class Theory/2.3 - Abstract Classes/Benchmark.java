public abstract class Benchmark {
    public Benchmark(int m) {
        // While the abstract class cannot be initialized, its constructor is necessary as a reference for the non-abstract subclasses' constructors.
        System.out.println(m);
    }
    abstract void action(); // Abstract method: its body implementation be provided by a non-abstract subclass.
    public long runTime(int t) {
        // Default method: a non-abstract subclass will get to choose whether to keep this implementation or override it.
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < t; i++) {
            action(); // This command refers to the subclass' implementation of action().
        }
        return (System.currentTimeMillis() - startTime);
    }
}
