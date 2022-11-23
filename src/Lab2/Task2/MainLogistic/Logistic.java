package Lab2.Task2.MainLogistic;

import Lab2.Task2.LogisticBranches.FirstBranche.Branche1;
import Lab2.Task2.LogisticBranches.FirstBranche.FirstBranchRoadTypes;
import Lab2.Task2.LogisticBranches.FirstBranche.MakeRoadForFirstBranche;
import Lab2.Task2.LogisticBranches.SecondBranche.Branche2;
import Lab2.Task2.LogisticBranches.SecondBranche.MakeRoadForSecondBranche;
import Lab2.Task2.LogisticBranches.SecondBranche.SecondBrancheRoadTypes;

public class Logistic {
    public static void main(String[] args) {
        Branche1 branche1 = new Branche1();
        Branche2 branche2 = new Branche2();

        MakeRoadForFirstBranche firstBrancheTruck = branche1.getRoad(FirstBranchRoadTypes.TRUCK);
        MakeRoadForFirstBranche firstBrancheShip = branche1.getRoad(FirstBranchRoadTypes.SHIP);
        MakeRoadForFirstBranche firstBranchePlane = branche1.getRoad(FirstBranchRoadTypes.PLANE);

        MakeRoadForSecondBranche secondBrancheShip = branche2.getRoad(SecondBrancheRoadTypes.SHIP);


        firstBrancheTruck.firstBrancheMakesRoad();
        firstBrancheTruck.firstBrancheMakesRoad();
        firstBranchePlane.firstBrancheMakesRoad();

        secondBrancheShip.secondBrancheMakesRoad();
    }
}
