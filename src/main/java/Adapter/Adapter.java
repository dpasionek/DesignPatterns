package Adapter;

public class Adapter extends Adaptee implements Target { /* An adapter using inheritance */

    public void request() {
        this.specificRequest();
    }
}
