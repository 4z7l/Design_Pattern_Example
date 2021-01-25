public class Main {
    public static void main(String[] args) {
        IntegerObservable observable = new IntegerObservable();
        StarObserver starObserver = new StarObserver();
        CircleObserver circleObserver = new CircleObserver();

        observable.registerObserver(starObserver);
        observable.registerObserver(circleObserver);

        System.out.println("\n>>Data Changed");
        observable.setData(2);

        System.out.println("\n>>Data Changed");
        observable.setData(5);

        observable.unregisterObserver(starObserver);
        observable.unregisterObserver(circleObserver);

        System.out.println("\n>>Data Changed");
        observable.setData(10);
    }
}
