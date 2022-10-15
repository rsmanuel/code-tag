package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pedro extends AcademiaDeCodigo {
    public Pedro (Map level) throws InterruptedException {
        super("./pics/characters/pedroLeft.png", "./pics/characters/pedroRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14),
                        "./pics/characters/pedroRight.png"), 20, level);
    }
}
