package Visitor;

public interface ItemVisitor {
    void visit(Apple apple);
    void visit(Kiwi kiwi);
    void visit(Raspberry raspberry);
}
