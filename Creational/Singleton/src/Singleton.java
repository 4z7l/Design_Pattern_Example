public class Singleton {
    private static Singleton instance;
    private String name;
    private int count = 0;

    private Singleton() {
        count++;
        name = "This is the only reference : " + count;
    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public String getName() {
        return name;
    }
}
