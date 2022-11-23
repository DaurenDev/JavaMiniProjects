package Lab3.Task1.CarDescription;

import Lab3.Task1.Enums.CarType;
import Lab3.Task1.Enums.Location;

public class Car {
    private CarType model;
    private Location location;

    public Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }
    public void construct(){

    }
    public CarType getModel(){
        return model;
    }
    public void setModel(CarType model){
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", location=" + location +
                '}';
    }
}
