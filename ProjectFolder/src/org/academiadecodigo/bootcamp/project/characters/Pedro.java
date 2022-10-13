package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pedro extends AcademiaDeCodigo {
    public Pedro (Map level) throws InterruptedException {
        super("./pics/characters/pedroLeft.png", "./pics/characters/pedroRight.png",
                new Picture(500, 500, "./pics/characters/pedroRight.png"), 10, level, true);
    }
}
