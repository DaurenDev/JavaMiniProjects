package Lab4.Task1;

import java.util.ArrayList;
import java.util.List;

public class Person implements SocialMedia {

    List<Follower> followers = new ArrayList<>();
    String message = " ";
    String status = "unknown";

    @Override
    public void addFollower(Follower follower) {
        System.out.println(follower.name + " has followed the User");
        followers.add(follower);
    }

    @Override
    public void removeFollower(Follower follower) {
        System.out.println(follower + " has unfollowed the User");
        int removingClient = followers.indexOf(follower);
        if(removingClient >= 0){
            followers.remove(follower);
        }
    }

    @Override
    public void messageForFollowers() {
        System.out.println("\n" + "USERS WHO HAVE FOLLOWED:");
        for(Follower follower : followers)
            follower.write(this.message);
            System.out.println();

    }

    @Override
    public void update(String message) {
        this.message = message;
        for(Follower follower: followers)
            System.out.println(follower.name + " : " + message);
    }

    @Override
    public String getState() {
        return status;
    }

    @Override
    public void setState(String status) {
        this.status = status;
    }
}
