package ChainOfResponsibility;

public abstract class AbstractLogger {

    protected AbstractLogger next;

    public void setNextLogger(AbstractLogger logger) {
        this.next = logger;
    }

    public void log(String message) {
        write(message);
        if(this.next != null)
            this.next.log(message);
    }

    public abstract void write(String message);
}
