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

    public boolean isHittingWall(MoveDirections directions){
        int x = pic.getX();
        int y = pic.getY();

        switch (directions){
            case UP:
                return y - speed <= 135;
            case DOWN:
                return y + pic.getHeight() > level.getBackground().getHeight() - 20;
            case LEFT:
                return x < 20;
            case RIGHT:
                return x > (level.getBackground().getWidth() - 14);
        }
        return false;
    }

    public void move(MoveDirections directions) {
        switch (directions){
            case UP:
                if (pic.getY() - speed < 135) {
                    pic.translate(0, -(pic.getY() - 134));
                    return;
                }
                pic.translate(0, -speed);
                return;
            case DOWN:
                if ((pic.getY() + pic.getHeight() + speed) > level.getBackground().getHeight() - 14){
                    pic.translate(0, (level.getBackground().getHeight() - 14) - (pic.getY() + pic.getHeight()));
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
