package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state;

    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }

}
