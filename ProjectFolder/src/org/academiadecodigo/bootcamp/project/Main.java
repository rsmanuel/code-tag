package org.academiadecodigo.bootcamp.project;
import org.academiadecodigo.bootcamp.project.rodrigo.Rodrigo;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Picture background = new Picture(500, 500);
        background.load("./pics/sets/base_1920x1080.png");
        background.draw();
        Rodrigo rodrigo = new Rodrigo();
        rodrigo.move();
    }
}