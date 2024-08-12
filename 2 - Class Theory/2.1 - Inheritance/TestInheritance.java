ublic class TestInheritance {
    public static void main(String[] args) {
        Employee e = new Employee("Mario Rossi", 3500);
        System.out.println(e.getSalary());
        e.raiseSalary(5);
        System.out.println(e.getSalary());

        Manager M = new Manager("Giulio Giuliani", 10000);
        System.out.println(M.getSalary());
        M.raiseSalary(3); // Okay: this is possible because the subclass inherits all the methods defined in the superclass.
        System.out.println(M.getSalary());
        M.setBonus(2000);
        System.out.println(M.getSalary());

        Employee x = new Manager("Mr. X", 0); // Okay: this is a case of polymorphism
        //x.setBonus(1000000); // No: this cannot be done as x is treated as an instance of class Employee. Use the "instanceof" operator instead.
        if (x instanceof Manager mx) {
            mx.setBonus(1000000);
        }
        System.out.println(x.getSalary()); // Observe that the subclass' implementation of the method is invoked.
    }
}
