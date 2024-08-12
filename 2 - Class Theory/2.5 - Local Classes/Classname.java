public class Classname {
    int x = 10; // This attribute is effectively final as it is never modified after its declaration.
    public int m() {
        int locvar = 0; // This attribute is effectively final as it is never modified after its declaration.
        class LocalClassname {
            int n() {
                System.out.println(x + locvar); // Okay: neither attribute is modified and both are effectively final, so the local class can interact with them.
                return 0;
            }
        }
        return 1000;
    }
}
