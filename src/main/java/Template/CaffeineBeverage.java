package Template;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        printSeparator();
        boilWater();
        brew();
        addItem();
        pourInCup();
    }

    private void printSeparator() {
        System.out.println("------------");
    }

    public void boilWater() {
        System.out.println("Mmmm. Boil. Boil. Boil");
    }

    public void pourInCup() {
        System.out.println("Pour! Pour! Pour!");
    }

    public abstract void brew();
    public abstract void addItem();
}
