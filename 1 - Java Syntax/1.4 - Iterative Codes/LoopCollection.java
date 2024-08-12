public class LoopCollection {
    public String user;
    LoopCollection(String user) {
        this.user = user;
    }
    public int factorial(int n) {
        if (n < 0) {
            System.out.println("???");
            return 0;
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            return f;
        }
    }
    public void printX(int x) {
        while (x > 0) {
            System.out.println("x");
            x--;
        }
    }
    public void againPrintX(int x) {
        do {
            System.out.println("x");
            x--;
        } while (x > 0);
    }
}
