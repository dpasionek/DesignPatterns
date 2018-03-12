package ChainOfResponsibility;

public class Logger2 extends AbstractLogger {

    public Logger2() {

    }

    @Override
    public void write(String message) {
        System.out.println("Logger2! -> " + message);
    }
}
