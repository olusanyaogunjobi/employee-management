package se.lexicon.sanya;

public abstract class Employee {

    protected static int baseSalary = 25_000;// for new employees

        private int salary;
        private String name;

    public Employee(String name) {

        this.salary = baseSalary;
        this.name = name;

    }

    public abstract void calculateSalary();


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}