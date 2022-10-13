package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cat extends AcademiaDeCodigo {
    public Cat (Map level) throws InterruptedException {
        super("./pics/characters/catLeft.png", "./pics/characters/catRight.png",
                new Picture(500, 500, "./pics/characters/catRight.png"), 10, level, true);
    }
}
