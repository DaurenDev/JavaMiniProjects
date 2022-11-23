package StatePattern.Good;

public interface State {
    void heat(GoodContext context);
    void frost(GoodContext context);
}
