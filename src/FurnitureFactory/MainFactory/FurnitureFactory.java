package FurnitureFactory.MainFactory;

import FurnitureFactory.FurnitureTypes.ChairType.Chair;
import FurnitureFactory.FurnitureTypes.CoffeeTableType.CoffeeTable;
import FurnitureFactory.FurnitureTypes.SofaType.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
