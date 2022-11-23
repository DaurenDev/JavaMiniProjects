package TempateMethodPattern;

public class School extends Education {
    private String name = "School";
    @Override
    public void study() {
        System.out.println(this.name + ": study");
    }

    @Override
    public void getDocument() {
        System.out.println(this.name + ": get attestat");
    }
}
