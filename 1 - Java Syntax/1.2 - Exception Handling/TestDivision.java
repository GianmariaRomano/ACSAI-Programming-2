public class TestDivision {
    public static void main(String[] args) {
        FirstDivision one = new FirstDivision();
        FirstDivision two = new FirstDivision();
        one.divisor(6, 3); // Okay: expect 2
        //two.divisor(6, 0); // An exception will be raised.

        SecondDivision three = new SecondDivision("operator three");
        SecondDivision four = new SecondDivision("operator four");
        three.divisor(16, 4); // Okay: expect 4
        four.divisor(16, 0); // Expect a different message.
    }
}
