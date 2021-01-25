public class Main {
    public static void main(String[] args) {
        Singleton singleton_reference1 = Singleton.getInstance();
        System.out.println("First Instance Name : "+singleton_reference1.getName());

        Singleton singleton_reference2 = Singleton.getInstance();
        System.out.println("Second Instance Name : "+singleton_reference2.getName());
    }
}
