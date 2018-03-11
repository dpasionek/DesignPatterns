package Proxy;

public class Plaintiff implements Person {

    private String name;

    public Plaintiff(String name) {
        this.name = name;
        prepareForCourt();
    }

    public void talk() {
        System.out.println("Not Guilty!");
    }

    private void prepareForCourt() {
        System.out.println("Ready for court!");
    }
}
