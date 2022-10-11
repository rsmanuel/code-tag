package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.directions.MoveDirections;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Characters {
    private String pathLeft;
    private String pathRigth;
    private Picture pic;
    private int speed;

    private int speedLeft;
    private Map level;

    public Characters(String pathLeft, String pathRigth, Picture pic, int speed, Map level){
        this.pathLeft = pathLeft;
        this.pathRigth = pathRigth;
        this.pic = pic;
        this.level = level;
        this.speed = speed;
        pic.draw();
    }

    public void move(MoveDirections directions) {
        switch (directions){
            case UP:
                if (pic.getY() - speed < 135) {
                    pic.translate(0, -(pic.getY() - 134));
                    return;
                }
                if (pic.getY() - speed < 623 && pic.getY() > 226 && pic.getX() >= 567 && pic.getX() <= 658) {
                    pic.translate(0, -(pic.getY() - 622));
                    return;
                }
                if (pic.getY() - speed < 623 && pic.getY() > 226 && pic.getX() >= 732 && pic.getX() <= 823) {
                    pic.translate(0, -(pic.getY() - 622));
                    return;
                }
                if (pic.getY() - speed < 623 && pic.getY() > 226 && pic.getX() >= 901 && pic.getX() <= 992) {
                    pic.translate(0, -(pic.getY() - 622));
                    return;
                }
                if (pic.getY() - speed < 623 && pic.getY() > 226 && pic.getX() >= 1066 && pic.getX() <= 1157) {
                    pic.translate(0, -(pic.getY() - 622));
                    return;
                }
                if (pic.getY() - speed < 623 && pic.getY() > 226 && pic.getX() >= 1231 && pic.getX() <= 1322) {
                    pic.translate(0, -(pic.getY() - 622));
                    return;
                }
                pic.translate(0, -speed);
                return;
            case DOWN:
                if ((pic.getY() + pic.getHeight() + speed) > level.getBackground().getHeight() - 14){
                    pic.translate(0, (level.getBackground().getHeight() - 14) - (pic.getY() + pic.getHeight()));
                    return;
                }
                if ((pic.getY() + pic.getHeight() + speed) > 226 && (pic.getX() + pic.getHeight() >= 567) && (pic.getX() + pic.getHeight() <= 658)) {
                    pic.translate(0, (pic.getY() + pic.getHeight()) - 226);
                    return;
                }
                pic.translate(0, speed);
                return;
            case LEFT:
                pic.load(pathLeft);
                if (pic.getX() - speed < 14) {
                    System.out.println(pic.getX());
                    pic.translate(-(pic.getX() - 13), 0);
                    return;
                }
                pic.translate(-(speed), 0);
                return;
            case RIGHT:
                pic.load(pathRigth);
                if((pic.getX() + pic.getWidth() + speed) > level.getBackground().getWidth() - 14) {
                    pic.translate((level.getBackground().getWidth() - 14) - (pic.getX() + pic.getWidth()), 0);
                    return;
                }
                pic.translate(speed, 0);
        }
    }
}
