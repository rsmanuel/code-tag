package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bri extends Characters {
    public Bri (Map level) {
        super("./pics/characters/briLeft.png", "./pics/characters/briRight.png",
                new Picture(500, 500, "./pics/characters/briRight.png"), 10, level ,true);
    }
}
