package Lab2.Task2.LogisticBranches.FirstBranche;



public class Branche1 {
    public MakeRoadForFirstBranche getRoad(FirstBranchRoadTypes roadType){
        MakeRoadForFirstBranche makeRoadForFirstBranche;

        switch (roadType){
            case TRUCK -> {
                makeRoadForFirstBranche = new FirstBrancheTruckRoad();
                break;
            }
            case SHIP -> {
                makeRoadForFirstBranche = new FirstBrancheShipRoad();
            }
            case PLANE -> {
                makeRoadForFirstBranche = new FirstBranchePlaneRoad();
            }
            default -> {
                throw new IllegalArgumentException(roadType + " has not been invented at First Branche yet");
            }
        }
        return makeRoadForFirstBranche;
    }
}
