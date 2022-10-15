package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cat extends AcademiaDeCodigo {
    public Cat (Map level) throws InterruptedException {
        super("./pics/characters/catLeft.png", "./pics/characters/catRight.png", 20, level);
    }
}
