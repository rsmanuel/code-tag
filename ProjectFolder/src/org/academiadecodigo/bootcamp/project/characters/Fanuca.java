package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fanuca extends AcademiaDeCodigo {
    public Fanuca (Map level) throws InterruptedException {
        super("./pics/characters/fanucaLeft.png", "./pics/characters/fanucaRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14),
                        "./pics/characters/fanucaRight.png"), 20, level);
    }
}
