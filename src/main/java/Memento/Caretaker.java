package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public List<Memento> getAllMementos() {
        return mementos;
    }
}
