package State;

public class FanSpeedExtreme implements State {

    public void execute(Context context) {
        System.out.println("FAN SPEED FAST!");
        context.setState(this);
    }
}
