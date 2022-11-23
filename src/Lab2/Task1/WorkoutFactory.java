package Lab2.Task1;

public class WorkoutFactory {
    public static Workout getWorkout(WorkoutType workoutType){

        Workout workout = null;

        if(workoutType == WorkoutType.UPPERBODY){
            workout = new UpperBody();
        }
        else if(workoutType == WorkoutType.LOWERBODY){
            workout = new LowerBody();
        }
        return workout;
    }
}
