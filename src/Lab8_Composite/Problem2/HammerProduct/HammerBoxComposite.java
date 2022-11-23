package Lab8_Composite.Problem2.HammerProduct;

import Lab8_Composite.Problem2.Product;

import java.util.ArrayList;
import java.util.List;

public class HammerBoxComposite extends Product {
    List<Product> listOfHammers = new ArrayList<>();
    int counter = 0;

    public HammerBoxComposite(String name, int price) {
        super(name, price);
    }

    @Override
    public void addProduct(Product product){
        this.listOfHammers.add(product);
    }

    @Override
    public void removeProduct(Product product){
        this.listOfHammers.remove(product);
    }

    @Override
    public void printAllProducts(Product product){
        System.out.println("Product name: " + product.name + "\n" + "Product price: " + product.price);

        System.out.println();
        for(Product items : product.getList()){
            if(items.getList() != null){

                printAllProducts(items);
                counter = items.price + counter;
            }
            else{
                System.out.println("Product name: " + items.name + "\n" + "Product price: " + items.price);
            }
        }

    }

    @Override
    public void totalPrice(){
        System.out.println(counter + price);
    }

    @Override
    public List<Product> getList(){
        return this.listOfHammers;
    }


}
