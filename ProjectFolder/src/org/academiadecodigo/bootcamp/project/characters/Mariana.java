package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Mariana extends AcademiaDeCodigo {
    public Mariana(Map level) throws InterruptedException {
        super("./pics/characters/marianaLeft.png", "./pics/characters/marianaRight.png",
                new Picture(100, 100, "./pics/characters/marianaRight.png"), 10, level, true);
    }
}