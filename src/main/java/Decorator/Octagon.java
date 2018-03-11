package Decorator;

public class Octagon implements Shape {

    public void draw() {
        System.out.println("Added a Octagon");
    }

    public String name() {
        return "Octagon";
    }
}
