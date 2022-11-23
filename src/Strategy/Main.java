package Strategy;

public class Main {
    public static void main(String[] args) {

        FatBurningTraining firstTraining = new Jumper();
        FatBurningTraining secondTraining = new Runner();

        firstTraining.trainingType.train();
        secondTraining.trainingType.train();

    }





}
