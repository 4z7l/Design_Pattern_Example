import abst.Factory;
import abst.Laptop;
import abst.Phone;
import apple.AppleFactory;
import samsung.SamsungFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = getFactory("Apple");
        //Factory factory = getFactory("Samsung");

        Phone phone = factory.createPhone();
        Laptop laptop = factory.createLaptop();

        System.out.println(phone.getName());
        System.out.println(laptop.getName());
    }

    static Factory getFactory(String name) {
        if ("Apple".equals(name)) {
            return new AppleFactory();
        } else if ("Samsung".equals(name)) {
            return new SamsungFactory();
        } else
            return null;
    }
}
