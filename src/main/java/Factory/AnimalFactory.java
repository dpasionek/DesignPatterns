package Factory;

public class AnimalFactory  {

    public Animal getAnimal(String name) {
        if(name.equalsIgnoreCase("giraffe")) return new Giraffe();
        if(name.equalsIgnoreCase("fox")) return new Fox();
        return null;
    }
}
