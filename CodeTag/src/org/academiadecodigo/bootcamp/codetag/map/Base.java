package org.academiadecodigo.bootcamp.codetag.map;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Base implements Map {
    private Picture background;


    public void init(){
        this.background = new Picture(0, 0, "pics/sets/base.png");
        background.draw();
    }

    @Override
    public Picture getBackground() {
        return background;
    }
}
