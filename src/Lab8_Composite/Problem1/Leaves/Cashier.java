package Lab8_Composite.Problem1.Leaves;

import Lab8_Composite.Problem1.Employee;

import java.util.List;

public class Cashier extends Employee {

    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void print(Employee employee) {

    }

    @Override
    public Employee getChild(int num) {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
