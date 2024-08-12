public class Manager extends Employee {
    private String name;
    private double salary;
    private double bonus;
    Manager(String name, double salary) {
        /*
        super: it always refers to the immediate superclass.
        this: it always refers to the current instance.
         */
        super(name, salary);
        this.bonus = 0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        // Overriding: the subclass gives a new implementation of the method, which also refers to the superclass' implementation.
        return super.getSalary() + bonus;
    }
}
