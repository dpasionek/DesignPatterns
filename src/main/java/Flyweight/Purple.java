package Flyweight;

public class Purple implements Color {

    private String shade;
    public Purple(String shade) {
        this.shade = shade;
    }

    public void name() {
        System.out.println("Purple!");
    }

    public boolean isTheBest() {
        return true;
    }

    public void getShade() {
        System.out.println(this.shade);
    }
}
