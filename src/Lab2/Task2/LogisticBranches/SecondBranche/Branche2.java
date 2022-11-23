package Lab2.Task2.LogisticBranches.SecondBranche;

public class Branche2 {
    public MakeRoadForSecondBranche getRoad(SecondBrancheRoadTypes roadType){
        MakeRoadForSecondBranche makeRoadForSecondBranche = null;
        switch (roadType){
            case SHIP -> {
                makeRoadForSecondBranche = new SecondBranchShipRoad();
            }
            default -> {
                System.out.println(roadType + " has not been invented at Second Branche yet");
            }
        }
        return makeRoadForSecondBranche;
    }
}
