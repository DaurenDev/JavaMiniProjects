package Lab4.Task2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainStore implements Store{

    List<Customer> customers = new ArrayList<>();
    String message = "empty message";

    @Override
    public void attachCustomer(Customer customer) {
        System.out.println(customer.name + " has been subscribed for store");
        customers.add(customer);
    }

    @Override
    public void detachCustomer(Customer customer) {
        System.out.println("\n");
        System.out.println(customer.name + " has unsubscribe from store");
        int customerIndex = customers.indexOf(customer);
        if(customerIndex >= 0){
            customers.remove(customerIndex);
        }
    }

    @Override
    public void amountOfCustomers() {
        System.out.println("\n \t ALL SUBSCRIBERS AND CUSTOMERS OF STORE");
        for(Customer subscriber : customers)
            System.out.println(subscriber.name);
    }

    @Override
    public void deliverForCustomer() {
        System.out.println("\n \t ATTENTION");
        for(Customer subscriber : customers)
            subscriber.write(this.message);
        System.out.println("\n");
    }

    @Override
    public void messageFromCustomer(String message) {
        this.message = message;
        for(Customer customer : customers){
            System.out.println(customer.name + " : " + message);
        }
    }

}

