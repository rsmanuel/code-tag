package org.academiadecodigo.bootcamp.project.map;

import org.academiadecodigo.bootcamp.project.characters.Characters;
import org.academiadecodigo.simplegraphics.pictures.Picture;

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

    @Override
    public void setBackground(Picture background) {
        this.background = background;
    }
}
