import java.util.ArrayList;

public class Observable {

    private ArrayList<Observer> observerCollection = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observerCollection.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observerCollection.remove(observer);
    }

    void notifyObservers() {
        for(Observer observer : observerCollection) {
            observer.update(this);
        }
    }
}
