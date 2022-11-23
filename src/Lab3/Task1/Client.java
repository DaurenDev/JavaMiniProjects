package Lab3.Task1;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.CarModel.LuxuryCar;
import Lab3.Task1.Countries.AsiaCarFactory;
import Lab3.Task1.Countries.DefaultCarFactory;
import Lab3.Task1.Countries.USACarFactory;
import Lab3.Task1.Enums.CarType;
import Lab3.Task1.MainCarFactory.CarFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CarFactory AsiaCarFactory = new AsiaCarFactory();
        CarFactory USACarFactory = new USACarFactory();
        CarFactory DefaultCarFactory = new DefaultCarFactory();

        Car car = AsiaCarFactory.buildCar(CarType.SEDAN);
        Car car1 = AsiaCarFactory.buildCar(CarType.SMAll);
        Car car2 = AsiaCarFactory.buildCar(CarType.LUXURY);

        car.construct();
        car1.construct();
        car2.construct();





    }
}
