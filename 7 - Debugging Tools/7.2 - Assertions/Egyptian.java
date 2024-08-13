public class Egyptian {
    public static void main(String[] args) {
        int a = 172;
        int b = 37;
        // int b = -37 // Observe that the code will not work if one of the values is negative.
        int x = a, y = b, res = 0;
        assert (y >= 0 && (x * y) + res == a * b) : "false invariant"; // If the condition is true, nothing happens, otherwise, if the condition is false, an AssertionError will be raised, showing the custom "false invariant" message.
        while (y >= 1) {
            if (y % 2 == 0) {
                x = x + x;
                y = y / 2;
            } else {
                res = res + x;
                y = y - 1;
            }
            assert (y >= 0 && (x * y) + res == a * b);
        }
        System.out.println(a + " * " + b + " = " + res);
    }
}
