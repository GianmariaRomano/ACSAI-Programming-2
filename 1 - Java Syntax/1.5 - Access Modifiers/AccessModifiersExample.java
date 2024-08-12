public class AccessModifiersExample {
    public int publicValue = 100; // Public value: accessible from everywhere
    private int privateValue = 0; // Private value: accessible only within its class
    protected int protectedValue = 50; // Protected value: accessible only within its package and to subclasses
    int defaultValue = 25; // Default value (no access modifier): accessible only within the package

    public int publicMethod() {
        System.out.println("Public method, accessible from everywhere!");
        return publicValue;
    }
    public int privateMethod() {
        System.out.println("Private method, accessible only within this class!");
        return privateValue;
    }
    protected int protectedMethod() {
        System.out.println("Protected method, accessible only within its package and to subclasses!");
        return protectedValue;
    }
    int deafultMethod() {
        System.out.println("Default method, accessible only within its package!");
        return defaultValue;
    }
}
