package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Mike42 extends QuarentaEDois {
    public Mike42(Map level) {
        super("./pics/characters/mic42left.png", "./pics/characters/mic42Right.png",
                new Picture(500, 500, "./pics/characters/mic42Right.png"), 10, level, false);
    }


}


