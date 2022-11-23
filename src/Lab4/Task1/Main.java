package Lab4.Task1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Follower follower = new ConcretePerson("Islomkhon");
        Follower follower1 = new ConcretePerson("Baubek");
        Follower follower2 = new ConcretePerson("Dauren");
        SocialMedia person = new Person();

        person.addFollower(follower);
        person.addFollower(follower1);
        person.addFollower(follower2);

        person.messageForFollowers();
        person.setState(input);
        String dev = person.getState();

        if(dev.equals("ONLINE")){
            person.update("HEY");
        }
        else{
            System.out.println("This user is not online");
        }
    }
}
