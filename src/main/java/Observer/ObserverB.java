package Observer;

public class ObserverB extends Observer {

    public ObserverB(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverB called to Update Subject (" + this.subject.getName() + "/ State: " + this.subject.getState() + ")");
    }
}
