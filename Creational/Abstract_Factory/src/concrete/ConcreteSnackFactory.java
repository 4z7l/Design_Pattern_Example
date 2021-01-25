package concrete;

import abst.AbstractSnackFactory;

public class ConcreteSnackFactory {
    public static AbstractSnackFactory createFactory(String snack){
        if("Oreo".equals(snack)){
            return new ConcreteOreoFactory();
        }else if("Pringles".equals(snack)){
            return new ConcretePringlesFactory();
        }else {
            return null;
        }
    }
}
