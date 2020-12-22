import abst.AbstractSnackFactory;
import bag.Bag;
import concrete.ConcretePringlesFactory;
import concrete.ConcreteSnackFactory;
import cookie.Cookie;
import concrete.ConcreteOreoFactory;

public class Main {
    public static void main(String[] args) {
        //AbstractSnackFactory factory = ConcreteSnackFactory.createFactory("Oreo");
        AbstractSnackFactory factory = ConcreteSnackFactory.createFactory("Pringles");

        Bag bag = factory.createBag();
        Cookie cookie = factory.createCookie();

        System.out.println(bag.getClass());
        System.out.println(cookie.getClass());
    }
}
