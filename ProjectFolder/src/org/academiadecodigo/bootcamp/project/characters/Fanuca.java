package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fanuca extends AcademiaDeCodigo {
    public Fanuca (Map level) throws InterruptedException {
        super("./pics/characters/fanucaLeft.png", "./pics/characters/fanucaRight.png",
                new Picture(500, 500, "./pics/characters/fanucaRight.png"), 10, level, true);
    }
}
