package org.academiadecodigo.bootcamp.project.map;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.HashMap;
import java.util.Iterator;

public class Base implements Map {
    private Picture background;


    public Base(){
        this.background = new Picture(0, 0, "./pics/sets/base.png");
        background.draw();
    }

    @Override
    public Picture getBackground() {
        return background;
    }
}
