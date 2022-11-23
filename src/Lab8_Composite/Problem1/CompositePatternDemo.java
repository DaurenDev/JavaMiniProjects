package Lab8_Composite.Problem1;

import Lab8_Composite.Problem1.Composite.*;
import Lab8_Composite.Problem1.Leaves.*;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee manager1 = new BankManager(1,"James", 125.00);
        Employee manager2 = new BankManager(2, "Islomkhon", 250.00);


        Employee leaf1 = new Accountant(10, "Karina", 25);
        Employee leaf2 = new Accountant(10, "Kenny", 25);



        manager1.add(manager2);
        manager2.add(leaf1);

        manager1.print(manager1);






    }
}
