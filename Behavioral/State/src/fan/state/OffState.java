package fan.state;

import fan.HandHeldFan;

public class OffState implements State {
    private static OffState _instance;

    public static OffState getInstance() {
        if (_instance == null)
            _instance = new OffState();
        return _instance;
    }

    @Override
    public void wind(HandHeldFan fan) {
        System.out.println("손풍기가 작동 중이 아닙니다.");
        fan.changeState(WeakState.getInstance());
    }
}
