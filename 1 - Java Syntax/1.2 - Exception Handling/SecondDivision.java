public class SecondDivision {
    public String s;
    SecondDivision(String s) {
        this.s = s;
    }
    public void divisor(int x, int y) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(s + " is not working properly...");
        }
    }
}
