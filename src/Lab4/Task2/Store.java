package Lab4.Task2;

public interface Store {
    public void attachCustomer(Customer customer);
    public void detachCustomer(Customer customer);
    public void amountOfCustomers();
    public void deliverForCustomer();
    public void messageFromCustomer(String message);
}
