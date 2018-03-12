package Prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape get(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void load() {
        Hexagon hexagon = new Hexagon();
        hexagon.setId("1");
        shapeMap.put(hexagon.getId(), hexagon);

        Rhombus rhombus = new Rhombus();
        rhombus.setId("2");
        shapeMap.put(rhombus.getId(), rhombus);

    }
}