package Observer;

public class ObserverC extends Observer {

    public ObserverC(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverC called to Update Subject (" + this.subject.getName() + "/ State: " + this.subject.getState() + ")");
    }
}
