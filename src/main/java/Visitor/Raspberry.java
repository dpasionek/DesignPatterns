package Visitor;

public class Raspberry implements Item {

    public void accept(ItemVisitor iv) {
        iv.visit(this);
    }
}
