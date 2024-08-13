import java.lang.reflect.*;

public class StackViolation {
    // Special example in which reflection is used to bypass access modifiers.
    public static void main(String[] args) throws Exception {
        MyStack s = new MyStack(10);
        s.push(31);
        s.push(42);
        s.push(53);
        // top = 1; // No: this is not possible because top has been declared as a private field.
        try {
            Class<?> C = s.getClass();
            Field f = C.getDeclaredField("top");
            f.setAccessible(true);
            f.set(s, 1); // In this way, top will be modified to be equal to 1.
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("...");
            e.printStackTrace();
        }
        System.out.println(s.pop()); // Observe that, due to the violation, the value 42 will be popped instead of the actual top value 53.
    }
}
