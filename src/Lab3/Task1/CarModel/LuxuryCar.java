package Lab3.Task1.CarModel;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.Enums.CarType;
import Lab3.Task1.Enums.Location;

public class LuxuryCar extends Car {
    public LuxuryCar(CarType model, Location location) {
        super(model, location);
    }

    @Override
    public void construct(){
        System.out.println("Luxury car has been constructed");
    }
}
