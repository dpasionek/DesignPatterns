package Visitor;

public class ItemVisitorImpl implements ItemVisitor {

    public void visit(Kiwi kiwi) {
        System.out.println("Got a Kiwi!");
    }

    public void visit(Apple apple) {
        System.out.println("WooHoo, an Apple!");
    }

    public void visit(Raspberry raspberry) {
        System.out.println("Rasssssspberry!");
    }
}
