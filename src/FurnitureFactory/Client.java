package FurnitureFactory;

import FurnitureFactory.MainFactory.FurnitureFactory;
import FurnitureFactory.StyleTypeFurnitureFactory.ArDecorFurnitureFactory;
import FurnitureFactory.StyleTypeFurnitureFactory.ModernFurnitureFactory;
import FurnitureFactory.StyleTypeFurnitureFactory.VictorianFurnitureFactory;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory modern = new ModernFurnitureFactory();
        FurnitureFactory arDecor = new ArDecorFurnitureFactory();
        FurnitureFactory victorian =  new VictorianFurnitureFactory();

        modern.createChair();
        modern.createSofa();
        modern.createCoffeeTable();

        System.out.println("---------------------");

        arDecor.createChair();
        arDecor.createSofa();
        arDecor.createCoffeeTable();

        System.out.println("---------------------");

        victorian.createChair();
        victorian.createSofa();
        victorian.createCoffeeTable();

    }
}
