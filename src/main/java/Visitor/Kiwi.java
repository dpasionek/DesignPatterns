package Visitor;

public class Kiwi implements Item {

    public void accept(ItemVisitor iv) {
        iv.visit(this);
    }
}
