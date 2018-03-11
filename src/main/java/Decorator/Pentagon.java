package Decorator;

public class Pentagon implements Shape {

    public void draw() {
        System.out.println("Added a Pentagon");
    }

    public String name() {
        return "Pentagon";
    }
}

