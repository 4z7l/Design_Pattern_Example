package fan.state;

import fan.HandHeldFan;

public class StrongState implements State{
    private static StrongState _instance;

    public static StrongState getInstance() {
        if (_instance == null)
            _instance = new StrongState();
        return _instance;
    }
    @Override
    public void wind(HandHeldFan fan) {
        System.out.println("강한 바람이 부는 중입니다!!! 휘잉!! 휘잉!! 휘이잉!!!!");
        fan.changeState(OffState.getInstance());
    }
}
