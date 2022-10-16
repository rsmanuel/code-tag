package org.academiadecodigo.bootcamp.codetag.game;

public class Randomizer {
    public static int getRandom(int max) {
        return getRandomRange(0, max);
    }

    public static int getRandomRange(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
