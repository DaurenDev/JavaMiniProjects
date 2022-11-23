package FurnitureFactory.StyleTypeFurnitureFactory;

import FurnitureFactory.FurnitureTypes.ChairType.Chair;
import FurnitureFactory.FurnitureTypes.ChairType.ModernChair;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.CoffeeTable;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.ModernCoffeeTable;
import FurnitureFactory.FurnitureTypes.SofaType.ModernSofa;
import FurnitureFactory.FurnitureTypes.SofaType.Sofa;
import FurnitureFactory.MainFactory.FurnitureFactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
