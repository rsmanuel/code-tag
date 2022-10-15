package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rodrigo extends AcademiaDeCodigo {
    public Rodrigo(Map level) throws InterruptedException {
        super("./pics/characters/rodrigoLeft.png", "./pics/characters/rodrigoRight.png", 20, level);
    }
}
