package FurnitureFactory.StyleTypeFurnitureFactory;

import FurnitureFactory.FurnitureTypes.ChairType.ArDecorChair;
import FurnitureFactory.FurnitureTypes.ChairType.Chair;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.ArDecorCoffeeTable;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.CoffeeTable;
import FurnitureFactory.FurnitureTypes.SofaType.ArDecorSofa;
import FurnitureFactory.FurnitureTypes.SofaType.Sofa;
import FurnitureFactory.MainFactory.FurnitureFactory;

public class ArDecorFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArDecorChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArDecorSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArDecorCoffeeTable();
    }
}
