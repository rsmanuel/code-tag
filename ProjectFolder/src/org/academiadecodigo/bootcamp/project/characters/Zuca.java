package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Zuca extends Characters {
    public Zuca(Map level) {
        super("./pics/characters/zucaLeft.png", "./pics/characters/zucaRight.png",
                new Picture(250, 500, "./pics/characters/zucaRight.png"), 10, level, true);
    }
}
