package Visitor;

public class Apple implements Item {

    public void accept(ItemVisitor iv) {
        iv.visit(this);
    }
}
