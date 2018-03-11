package Command;

public class BuyCommand implements Command {

    private int amount;
    public BuyCommand(int amount) {
        this.amount = amount;
    }

    public void execute() {
        System.out.println("Executing Command! - Buying " + this.amount);
    }
}
