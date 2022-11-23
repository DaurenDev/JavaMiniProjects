package Lab3.Task1.CarModel;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.Enums.CarType;
import Lab3.Task1.Enums.Location;

public class SmallCar extends Car {
    public SmallCar(CarType type, Location location) {
        super(type, location);
    }

    @Override
    public void construct(){
        System.out.println("Small car has been constructed");
    }
}
