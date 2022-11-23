package StatePattern.Good;

import StatePattern.Bad.WaterType;

public class GoodContext {
    State type;
    public GoodContext(State type) {
        this.type = type;
    }

    public void heat() {
        this.type.heat(this); // <--
    }

    public void frost() {
        this.type.frost(this); // <--
    }
}
