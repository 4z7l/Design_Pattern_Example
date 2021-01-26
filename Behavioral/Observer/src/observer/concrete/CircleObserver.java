package observer.concrete;

import observer.Observer;
import subject.IntegerObservable;
import subject.Observable;

public class CircleObserver implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.print("<< Circle Draw : ");
        for (int i = 0; i < ((IntegerObservable) observable).getData(); i++) {
            System.out.print("o");
        }
        System.out.println();
    }
}
