package org.academiadecodigo.bootcamp.project.rodrigo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rodrigo {

    private String path = "ProjectFolder/src/org/academiadecodigo/bootcamp/project/pics/characters/rodrigo.png";
    private Picture pic;

    public void move() throws InterruptedException {

        while(true) {
            pic.translate(10, 0);
            Thread.sleep(1000);
        }
    }

    public Rodrigo() {
        this.pic = new Picture(69, 104);
        pic.load(path);
        pic.draw();
        System.out.println(pic.getWidth() + " " + pic.getHeight());
    }
}
