public class TestLoop {
    public static void main(String[] args) {
        LoopCollection s = new LoopCollection("Shabbethai Donnolo");
        System.out.println(s.factorial(4));

        LoopCollection mrX = new LoopCollection("Mr. X");
        mrX.printX(3); // Okay: "x" will be printed three times.
        mrX.printX(-1); // Nothing will happen.
        mrX.againPrintX(3); // Pretty much the same behaviour as printX.
        mrX.againPrintX(-1); // Notice that, in this case, "x" will be printed once because the code first executes the loop and then checks the condition.
    }
}
