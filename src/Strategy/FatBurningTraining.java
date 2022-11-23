package Strategy;

public class FatBurningTraining {
    TrainingType trainingType = null;

    public FatBurningTraining(){

    }

    public void startTraining(){
        this.trainingType.train();
    }
}
