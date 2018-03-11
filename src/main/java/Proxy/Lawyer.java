package Proxy;

public class Lawyer implements Person {

    public String name;
    private Plaintiff plaintiff;

    public Lawyer(String name) {
        this.name = name;
    }

    public void talk() {
        if(plaintiff == null) {
            plaintiff = new Plaintiff("Fred");
        }

        plaintiff.talk();
    }
}
