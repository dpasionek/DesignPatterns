package State;

public class FanSpeedLow implements State {

    public void execute(Context context) {
        System.out.println("Low Speed");
        context.setState(this);
    }
}
