package TempateMethodPattern;

public class University extends Education{
    private String name = "University";

    @Override
    public void study() {
        System.out.println(this.name + ": study");
        System.out.println(this.name + ": practice");
    }

    @Override
    public void getDocument() {
        System.out.println(this.name + ": get diploma");
    }
}
