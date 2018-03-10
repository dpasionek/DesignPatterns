package Strategy;

public class Strategy {
    Behavior behavior;

    public Strategy() {

    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void executeBehavior() {
        this.behavior.behave();
    }
}
