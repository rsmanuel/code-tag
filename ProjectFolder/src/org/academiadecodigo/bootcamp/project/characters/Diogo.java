package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Diogo extends AcademiaDeCodigo{
    public Diogo(Map level) throws InterruptedException {
        super("./pics/characters/diogoLeft.png", "./pics/characters/diogoRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14),
                        "./pics/characters/diogoRight.png"), 20, level, true);
    }
}
