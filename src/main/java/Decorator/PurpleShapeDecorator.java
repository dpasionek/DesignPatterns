package Decorator;

public class PurpleShapeDecorator extends ShapeDecorator {

    public PurpleShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        purple(decoratedShape);

    }

    private void purple(Shape s) {
        System.out.println(this.name() + " " + s.name());
    }

    public String name() {
        return "Purple Shape";
    }
}
