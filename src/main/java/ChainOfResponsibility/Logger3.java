package ChainOfResponsibility;

public class Logger3 extends AbstractLogger {

    public Logger3() {

    }

    @Override
    public void write(String message) {
        System.out.println("Logger3! -> " + message);
    }
}
