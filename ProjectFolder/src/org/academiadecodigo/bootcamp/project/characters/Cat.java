package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cat extends AcademiaDeCodigo {
    public Cat (Map level) throws InterruptedException {
        super("./pics/characters/catLeft.png", "./pics/characters/catRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14)
                        ,"./pics/characters/catRight.png"), 20, level, true);
    }
}
