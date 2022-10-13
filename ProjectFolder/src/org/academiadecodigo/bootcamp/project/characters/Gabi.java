package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Gabi extends Characters {
    public Gabi (Map level) {
        super("./pics/characters/gabiLeft.png", "./pics/characters/gabiRight.png",
                new Picture(500, 500, "./pics/characters/gabiRight.png"), 10, level, true);
    }
}
