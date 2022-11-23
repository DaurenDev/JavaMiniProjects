package FurnitureFactory.StyleTypeFurnitureFactory;

import FurnitureFactory.FurnitureTypes.ChairType.Chair;
import FurnitureFactory.FurnitureTypes.ChairType.VictorianChair;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.CoffeeTable;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.VictorianCoffeeTable;
import FurnitureFactory.FurnitureTypes.SofaType.Sofa;
import FurnitureFactory.FurnitureTypes.SofaType.VictorianSofa;
import FurnitureFactory.MainFactory.FurnitureFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
