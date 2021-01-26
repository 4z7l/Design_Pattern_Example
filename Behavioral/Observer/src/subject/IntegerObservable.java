package subject;

public class IntegerObservable extends Observable{

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }
}
