package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MikeAC extends Characters {
    public MikeAC (Map level) {
        super("./pics/characters/micLeft.png", "./pics/characters/micRight.png",
                new Picture(500, 500, "./pics/characters/micRight.png"), 10, level, true);
    }
}