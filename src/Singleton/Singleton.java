package Singleton;

public class Singleton {
    private static Singleton INSTANCE;
    public String name;

    private Singleton(String name){
        this.name = name;
    }


    public static Singleton getInstance(String name){
        if(INSTANCE == null){
            INSTANCE = new Singleton(name);
        }
        return INSTANCE;
    }
}
