package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PedroG extends AcademiaDeCodigo{
    public PedroG (Map level) throws InterruptedException {
        super("./pics/characters/geeLeft.png", "./pics/characters/geeRight.png",
                new Picture(500, 500, "./pics/characters/geeRight.png"), 10, level, true);
    }
}
