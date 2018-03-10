package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {

    private Map<String, Color> flyweights = new HashMap<String, Color>();

    public Color get(String shade) {
        Color flyweight = flyweights.get(shade);
        if(flyweight == null) {
            System.out.println("-- Creating new Purple Object! --");
            flyweight = new Purple(shade);
            flyweights.put(shade, flyweight);
        }
        return flyweight;
    }
}
