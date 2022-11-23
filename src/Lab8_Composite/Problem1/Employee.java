package Lab8_Composite.Problem1;

import java.util.List;

public abstract class Employee {

    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract void print(Employee employee);
    public abstract Employee getChild(int num);
    public abstract int getId();
    public abstract String getName();
    public abstract double getSalary();
    public List<Employee> getList(){
        return null;
    }

}
