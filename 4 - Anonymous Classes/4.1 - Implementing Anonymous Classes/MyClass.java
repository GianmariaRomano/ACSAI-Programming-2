public class MyClass<E> implements MyInterface {
    public E e;
    public MyClass(E e) {
        this.e = e;
    }
    public E get() {
        return e;
    }
    public static void main(String[] args) {
        /*
        The first way of implementing anonymous classes is by means of a functional interface.
        In this case, you write new classname() {};.
         */
        MyInterface<String> S = new MyClass<String>("S") {
            public String get() {
                return super.get();
            }
        };
        MyInterface<Integer> I = new MyClass<Integer>(26) {
            public Integer get() {
                return super.get();
            }
        };
        // Both commands will return the input parameter e specified by the instance as the anonymous subclass' method is invoked.
        System.out.println(S.get());
        System.out.println(I.get());
    }
}
