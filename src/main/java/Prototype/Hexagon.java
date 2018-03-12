package Prototype;

public class Hexagon extends Shape {

    public Hexagon() {
        this.type = "Hexagon";
    }
    @Override
    public void draw() {
        System.out.println("I'm a HEXAGON :D");
    }
}
