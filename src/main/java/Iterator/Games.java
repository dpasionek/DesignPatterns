package Iterator;

import java.util.Iterator;

public class Games {
    private Game gameList[] = {new Game("Skyrim"), new Game("Assassin's Creed"), new Game("Morrowind")};

    public Iterator getIterator() {
        return new GameIterator();
    }

    private class GameIterator implements Iterator {

        private int index = 0;

        public Object next() {
            return gameList[index++];
        }

        public boolean hasNext() {
            if(index < gameList.length) return true;
            return false;
        }

        public void remove() { }
    }
}
