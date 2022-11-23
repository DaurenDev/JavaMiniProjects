package Lab4.Task2;

public class Procedure {
    public static void main(String[] args) {
        Customer customer = new ConcreteCustomer("Vladimir");
        Customer customer1 = new ConcreteCustomer("Ivan");
        Customer customer2 = new ConcreteCustomer("Andrey");
        Customer customer3 = new ConcreteCustomer("Mariya");

        Store store = new MainStore();
        store.attachCustomer(customer);
        store.attachCustomer(customer1);
        store.attachCustomer(customer2);
        store.attachCustomer(customer3);

        store.detachCustomer(customer2);

        store.amountOfCustomers();
        store.deliverForCustomer();
        store.messageFromCustomer("Thanks!");



    }
}
