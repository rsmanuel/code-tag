package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rodrigo extends Characters {
    public Rodrigo(Map level) {
        super("./pics/characters/rodrigoLeft.png", "./pics/characters/rodrigoRight.png",
                new Picture(500, 500, "./pics/characters/rodrigoRight.png"), 10, level, true);
    }
}
