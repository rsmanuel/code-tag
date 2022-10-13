package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Diogo extends AcademiaDeCodigo{
    public Diogo(Map level) throws InterruptedException {
        super("./pics/characters/diogoLeft.png", "./pics/characters/diogoRight.png",
                new Picture(250, 500, "./pics/characters/diogoRight.png"), 10, level, true);
    }
}
