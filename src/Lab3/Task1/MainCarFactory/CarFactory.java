package Lab3.Task1.MainCarFactory;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.Enums.CarType;

public abstract class CarFactory {
    public abstract Car buildCar(CarType type);
}
