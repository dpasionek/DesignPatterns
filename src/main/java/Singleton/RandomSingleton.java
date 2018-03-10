package Singleton;

import java.util.*;

public class RandomSingleton {
    private static RandomSingleton randomsingleton;
    private static int r;
    private static Random rand;
    private RandomSingleton(int i) { rand = new Random(i); }

    public static RandomSingleton getRandomSingletonInstance(int i) {
        if(randomsingleton == null)
            randomsingleton = new RandomSingleton(i);
        return randomsingleton;
    }

    public int getRandTo100() {
        return rand.nextInt(100) + 1;
    }
}