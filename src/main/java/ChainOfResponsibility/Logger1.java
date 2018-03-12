package ChainOfResponsibility;

public class Logger1 extends AbstractLogger {

    public Logger1() {

    }
    @Override
    public void write(String message) {
        System.out.println("Logger 1! -> " + message);
    }
}
