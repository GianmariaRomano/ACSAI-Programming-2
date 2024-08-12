public class Employee {
    private String name;
    private double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double percentage) {
        double raise = this.salary * (percentage / 100);
        this.salary += raise;
    }
}
