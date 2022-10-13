package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Rodrigo42 extends QuarentaEDois {
    public Rodrigo42(Map level) {
        super("./pics/characters/rodrigo42left.png", "./pics/characters/rodrigo42Right.png",
                new Picture(500, 500, "./pics/characters/rodrigo42Right.png"), 10, level, false);
    }
}

