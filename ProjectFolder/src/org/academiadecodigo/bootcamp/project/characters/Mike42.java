package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Mike42 extends QuarentaEDois {
    public Mike42(Map level) {
        super("./pics/characters/mike42left.png", "./pics/characters/mike42Right.png",
                new Picture(500, 500, "./pics/characters/mike42Right.png"), 10, level, false);
    }


}


