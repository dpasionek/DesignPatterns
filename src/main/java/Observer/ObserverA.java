package Observer;

public class ObserverA extends Observer {

    public ObserverA(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverA called to Update Subject (" + this.subject.getName() + "/ State: " + this.subject.getState() + ")");
    }
}
