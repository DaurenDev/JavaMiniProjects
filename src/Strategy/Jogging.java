package Strategy;

public class Jogging implements TrainingType{
    @Override
    public void train() {
        System.out.println("Run 5 km");
    }
}
