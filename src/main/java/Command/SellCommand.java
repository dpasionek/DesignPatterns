package Command;

public class SellCommand implements Command {

    private int amount;

    public SellCommand(int amount) {
        this.amount = amount;
    }

    public void execute() {
        System.out.println("Executing Command! - Selling " + this.amount);
    }
}
