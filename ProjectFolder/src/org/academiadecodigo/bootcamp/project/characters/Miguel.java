package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Miguel extends AcademiaDeCodigo{
    public Miguel(Map level) throws InterruptedException {
        super("./pics/characters/miguelLeft.png", "./pics/characters/miguelRight.png",
                new Picture(Randomizer.getRandomRange(14, 1426), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14),
                        "./pics/characters/miguelRight.png"), 20, level);
    }
}
