package Lab8_Composite.Problem1.Composite;

import CompositePattern.Component;
import Lab8_Composite.Problem1.Employee;

import java.util.ArrayList;
import java.util.List;

public class BankManager extends Employee {

    List<Employee> list = new ArrayList<>();


    public BankManager(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void add(Employee employee) {
        this.list.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        this.list.remove(employee);
    }

    @Override
    public void print(Employee employee) {
        System.out.println(employee.id + "\n" + employee.name + "\n" + employee.salary);
        for(Employee item : employee.getList()){
            if(item.getList() != null) {
                print(item);
            }
            else{
                System.out.println(item.id + "\n" + item.name + "\n" + item.salary);
            }
        }

    }

    @Override
    public List<Employee> getList(){
        return this.list;
    }

    @Override
    public Employee getChild(int num) {
        return list.get(num);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
