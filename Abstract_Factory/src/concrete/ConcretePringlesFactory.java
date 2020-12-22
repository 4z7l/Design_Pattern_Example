package concrete;

import abst.AbstractSnackFactory;
import bag.Bag;
import bag.PringlesBag;
import cookie.Cookie;
import cookie.PringlesCookie;

public class ConcretePringlesFactory implements AbstractSnackFactory {
    @Override
    public Bag createBag() {
        System.out.println("create Red Bag");
        return new PringlesBag();
    }

    @Override
    public Cookie createCookie() {
        System.out.println("create Potato Chips");
        return new PringlesCookie();
    }
}
