package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Teresa42 extends Characters {
    public Teresa42(Map level) {
        super("./pics/characters/teresa42left.png", "./pics/characters/teresa42Right.png",
                new Picture(500, 500, "./pics/characters/teresa42Right.png"), 10, level, false);
    }
}

