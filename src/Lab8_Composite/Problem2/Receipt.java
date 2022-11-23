package Lab8_Composite.Problem2;

import Lab8_Composite.Problem2.HammerProduct.Hammer;
import Lab8_Composite.Problem2.HammerProduct.HammerBoxComposite;
import Lab8_Composite.Problem2.PhoneProduct.Headphones;
import Lab8_Composite.Problem2.PhoneProduct.Phone;
import Lab8_Composite.Problem2.PhoneProduct.PhoneBoxComposite;
import Lab8_Composite.Problem2.PhoneProduct.PhoneSetBoxComposite;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product phoneProduct = new PhoneSetBoxComposite("PhoneSet", 0);
        Product hammerProduct = new HammerBoxComposite("HammerSet", 5);
        startMenu();
        menuOptions();
        String choose = scanner.nextLine();

        if(choose.equalsIgnoreCase("Hammer")){
            hammerTypes();
            String hammerType = scanner.nextLine();

            if(hammerType.equalsIgnoreCase("Sledgehammer")){
                hammerProduct.addProduct(new Hammer("Sledgehammer", 10));
                hammerProduct.printAllProducts(hammerProduct);
                hammerProduct.totalPrice();
            }

            else if(hammerType.equalsIgnoreCase("SimpleHammer")){
                hammerProduct.addProduct(new Hammer("SimpleHammer", 5));
                hammerProduct.printAllProducts(hammerProduct);
                hammerProduct.totalPrice();

            }
        }

        else if(choose.equalsIgnoreCase("Phone")){
            phoneTypes();
            String phoneType = scanner.nextLine();

            if(phoneType.equalsIgnoreCase("Samsung")){
                phoneProduct.addProduct(new Phone("Samsung A50", 150));
                phoneProduct.printAllProducts(phoneProduct);
                phoneProduct.totalPrice();
            }

            else if(phoneType.equalsIgnoreCase("Iphone")){
                phoneProduct.addProduct(new Phone("Iphone X", 350));
                phoneProduct.printAllProducts(phoneProduct);
                phoneProduct.totalPrice();
            }
        }

        else if(choose.equalsIgnoreCase("Headphones")){
            headPhonesTypes();
            String headPhone = scanner.nextLine();

            if(headPhone.equalsIgnoreCase("JBL")){
                phoneProduct.addProduct(new Headphones("JBL50", 100));
                phoneProduct.printAllProducts(phoneProduct);
                phoneProduct.totalPrice();
            }

            else if(headPhone.equalsIgnoreCase("Iphone")){
                phoneProduct.addProduct(new Phone("SamsungAirBuds", 120));
                phoneProduct.printAllProducts(phoneProduct);
                phoneProduct.totalPrice();
            }
        }




    }

    public static void startMenu(){
        System.out.println("\t\t Welcome to our store.\n \t\t Make your order!");
    }

    public static void menuOptions(){
        System.out.print("1. Hammer \t\t");
        System.out.print("2. Phone \t\t");
        System.out.println("3. Headphones");

    }

    public static void hammerTypes(){
        System.out.print("1. SimpleHammer \t\t");
        System.out.println("2. Sledgehammer");
    }

    public static void phoneTypes(){
        System.out.print("1. Samsung \t\t");
        System.out.println("2. Iphone");
    }

    public static void headPhonesTypes(){
        System.out.print("1. JBL \t\t");
        System.out.println("2. SamsungAirBuds");
    }
}
