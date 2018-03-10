package Template;

public class Tea extends CaffeineBeverage {

    @Override
    public void addItem() {
        System.out.println("Adding tea bag!");
        System.out.println("Adding honey!");
    }

    @Override
    public void brew() {
        System.out.println("Steep. Steep. Steep.");
    }
}
