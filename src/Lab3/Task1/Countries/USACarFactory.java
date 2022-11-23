package Lab3.Task1.Countries;

import Lab3.Task1.CarDescription.Car;
import Lab3.Task1.CarModel.LuxuryCar;
import Lab3.Task1.CarModel.SedanCar;
import Lab3.Task1.CarModel.SmallCar;
import Lab3.Task1.Enums.CarType;
import Lab3.Task1.Enums.Location;
import Lab3.Task1.MainCarFactory.CarFactory;

public class USACarFactory extends CarFactory {
    @Override
    public Car buildCar(CarType type) {
        Car car = null;

        switch (type){
            case SMAll ->{
                car = new SmallCar(CarType.SMAll, Location.USA);
                break;
            }
            case SEDAN ->{
                car = new SedanCar(CarType.SEDAN, Location.USA);
                break;
            }
            case LUXURY ->{
                car = new LuxuryCar(CarType.LUXURY, Location.USA);
                break;
            }
            default -> {
                throw new IllegalArgumentException(car + "model doesn't exist in this country");
            }
        }
        return car;
    }
}
