package Lab3.Task1.CarModel;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.Enums.CarType;
import Lab3.Task1.Enums.Location;

public class SedanCar extends Car {
    public SedanCar(CarType model, Location location) {
        super(model, location);
    }

    @Override
    public void construct(){
        System.out.println("Sedan car has been constructed");
    }
}
