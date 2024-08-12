public class FirstDivision {
    public void divisor(int x, int y) throws ArithmeticException {
        if (y == 0) throw new ArithmeticException();
        System.out.println(x / y);
    }
}
