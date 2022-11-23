package Lab4.Task1;

public class ConcretePerson extends Follower {

    public ConcretePerson(String clientName){
        this.name = clientName;
    }

    @Override
    void write(String comment) {
        comment = " has sent you a message in private chat. Check your inbox!";
        System.out.println(this.name + comment);
    }
}
