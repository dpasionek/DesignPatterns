package Template;

public class Coffee extends CaffeineBeverage {
    @Override
    public void addItem() {
        System.out.println("Adding Cream!");
        System.out.println("Adding Sugar!");
    }

    @Override
    public void brew() {
        System.out.println("Brewing some Coffee!");
    }
}
