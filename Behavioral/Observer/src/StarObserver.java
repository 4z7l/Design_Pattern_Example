public class StarObserver implements Observer{
    @Override
    public void update(Observable observable) {
        for (int i = 0; i < ((IntegerObservable) observable).getData(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
