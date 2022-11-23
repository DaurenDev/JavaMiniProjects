package Lab4.Task1;

public interface SocialMedia {
    public void addFollower(Follower follower);
    public void removeFollower(Follower follower);
    public void messageForFollowers();
    public void update(String message);
    public String getState();
    public void setState(String status);
}
