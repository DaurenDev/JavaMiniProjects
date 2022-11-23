package Lab2.Task1;

public class Main {
    public static void main(String[] args) {
        Workout upperBodyWorkout = WorkoutFactory.getWorkout(WorkoutType.UPPERBODY);
        Workout lowerBodyWorkout = WorkoutFactory.getWorkout(WorkoutType.LOWERBODY);

        upperBodyWorkout.createWorkout();
        lowerBodyWorkout.createWorkout();

    }
}
