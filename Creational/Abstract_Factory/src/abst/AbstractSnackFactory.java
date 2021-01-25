package abst;

import bag.Bag;
import cookie.Cookie;

public interface AbstractSnackFactory {
    Bag createBag();
    Cookie createCookie();
}
