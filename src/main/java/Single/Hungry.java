package Single;

public class Hungry {
    private Hungry(){}

    private static final Hungry HUNGRY = new Hungry();
    public static Hungry getHungry(){
        return HUNGRY;
    }
}
