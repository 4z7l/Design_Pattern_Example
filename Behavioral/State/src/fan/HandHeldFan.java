package fan;

import fan.state.State;
import fan.state.WeakState;

public class HandHeldFan {
    private State state;

    public HandHeldFan() {
        changeState(WeakState.getInstance());
    }

    public void clickButton() {
        state.wind(this);
    }

    public void changeState(State state){
        this.state = state;
    }
}
