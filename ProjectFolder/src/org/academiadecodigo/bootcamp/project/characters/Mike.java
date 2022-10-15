package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Mike extends AcademiaDeCodigo {
    public Mike(Map level) throws InterruptedException {
        super("./pics/characters/mikeLeft.png", "./pics/characters/mikeRight.png", 20, level);
    }
}