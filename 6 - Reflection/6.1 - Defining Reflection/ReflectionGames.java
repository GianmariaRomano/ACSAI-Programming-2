import java.lang.reflect.*;

public class ReflectionGames {
    // Reflection consists in creating an object of type Class<T> and using it to study/make instances of said class T.
    private static void printMembers(Member[] members) {
        for (Member m : members) {
            System.out.println(m);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // Since Class<T> does not have a public constructor, its instances are created via the Class.forName(classname) method, which, however, works correctly only for strings (for this reason, the method is handled using raw types or wildcards instead).
        System.out.println(Class.forName("java.lang.String"));
        System.out.println(Class.forName("java.lang.String").getSimpleName());

        // Class<String> CS = Class.forName("java.lang.String"); // Okay: this method works correctly with strings.
        // Class<Integer> CI = Class.forName("java.lang.Integer"); // No: for some reason, any other class gives problems.
        Class CS = Class.forName("java.lang.String"); // Okay: this is a special case in which using raw types is actually convenient
        Class CI = Class.forName("java.lang.Integer");
        Class CA = Class.forName("java.util.ArrayList");

        // The following methods return arrays containing the items found inside the class.
        printMembers(CA.getDeclaredFields());
        printMembers(CS.getDeclaredConstructors());
        printMembers(CI.getDeclaredMethods());

        // Here are some examples on how to use instances of class Field/Consructor/Method.
        Method bits = CI.getDeclaredMethods()[3]; // Instance of the bitCount() method.
        System.out.println(bits.invoke(0, 85)); // This is equivalent to saying 0.m(85).
    }
}
