package observer.concrete;

import observer.Observer;
import subject.IntegerObservable;
import subject.Observable;

public class StarObserver implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.print("<< Star Draw : ");
        for (int i = 0; i < ((IntegerObservable) observable).getData(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
