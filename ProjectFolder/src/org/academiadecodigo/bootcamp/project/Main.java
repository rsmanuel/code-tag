package org.academiadecodigo.bootcamp.project;
import org.academiadecodigo.bootcamp.project.rodrigo.Rodrigo;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {
        Picture background = new Picture(0, 0, "./pics/sets/base.png");
        background.draw();
        Rodrigo rodrigo = new Rodrigo();
        rodrigo.move();
    }
}