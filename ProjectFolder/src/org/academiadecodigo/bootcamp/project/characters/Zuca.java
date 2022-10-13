package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.directions.MoveDirections;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Zuca extends AcademiaDeCodigo {
    public Zuca(Map level) throws InterruptedException {
        super("./pics/characters/zucaLeft.png", "./pics/characters/zucaRight.png",
                new Picture(299, 500, "./pics/characters/zucaRight.png"), 4, level, true);
    }
}
