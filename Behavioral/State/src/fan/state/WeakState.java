package fan.state;

import fan.HandHeldFan;

public class WeakState implements State{
    private static WeakState _instance;

    public static WeakState getInstance() {
        if (_instance == null)
            _instance = new WeakState();
        return _instance;
    }

    @Override
    public void wind(HandHeldFan fan) {
        System.out.println("약한 바람이 부는 중입니다.. 휘잉..");
        fan.changeState(StrongState.getInstance());
    }
}
