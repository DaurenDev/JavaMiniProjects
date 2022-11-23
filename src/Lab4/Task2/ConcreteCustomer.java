package Lab4.Task2;

public class ConcreteCustomer extends Customer{

    public ConcreteCustomer(String customerName){
        this.name = customerName;
    }

    @Override
    public void write(String comment) {
        comment = " : hurry up to pre-order!";
        System.out.println(this.name + comment);
    }
}
