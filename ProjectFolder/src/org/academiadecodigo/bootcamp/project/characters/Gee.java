package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Gee extends AcademiaDeCodigo{
    public Gee(Map level) throws InterruptedException {
        super("./pics/characters/geeLeft.png", "./pics/characters/geeRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14),
                        "./pics/characters/geeRight.png"), 20, level);
    }
}