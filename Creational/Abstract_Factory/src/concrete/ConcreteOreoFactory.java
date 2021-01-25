package concrete;

import abst.AbstractSnackFactory;
import bag.Bag;
import cookie.Cookie;
import bag.OreoBag;
import cookie.OreoCookie;

public class ConcreteOreoFactory implements AbstractSnackFactory {
    @Override
    public Bag createBag() {
        System.out.println("create Blue Bag");
        return new OreoBag();
    }

    @Override
    public Cookie createCookie() {
        System.out.println("create Top Black");
        System.out.println("create Middle White");
        System.out.println("create Bottom Black");

        return new OreoCookie();
    }
}
