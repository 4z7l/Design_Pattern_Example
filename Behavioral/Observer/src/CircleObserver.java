public class CircleObserver implements Observer {
    @Override
    public void update(Observable observable) {
        for (int i = 0; i < ((IntegerObservable) observable).getData(); i++) {
            System.out.print("o");
        }
        System.out.println();
    }
}
