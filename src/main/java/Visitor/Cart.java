package Visitor;

public class Cart implements Item {

    Item items[] = {new Apple(), new Kiwi(), new Raspberry(), new Apple()};
    public void accept(ItemVisitor iv) {
        for(Item i : items)
            i.accept(iv);
    }
}
