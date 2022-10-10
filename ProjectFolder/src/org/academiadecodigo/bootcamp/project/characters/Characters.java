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
    private Map level;

    public Characters(String pathLeft, String pathRigth, Picture pic, int speed, Map level){
        this.pathLeft = pathLeft;
        this.pathRigth = pathRigth;
        this.pic = pic;
        this.level = level;
        this.speed = 10;
        pic.draw();
    }

    public boolean isHittingWall(MoveDirections directions){
        int x = pic.getX();
        int y = pic.getY();

        switch (directions){
            case UP:
                return (y - speed) < (135 - speed);
            case DOWN:
                return (y + speed) > (level.getBackground().getHeight() - (pic.getHeight() - 1) - 14);
            case LEFT:
                return (x - speed) < (14 - speed);
            case RIGHT:
                return (x + speed) > (level.getBackground().getWidth() - 14);
        }
        return false;
    }

    public void move(MoveDirections directions) {
        switch (directions){
            case UP:
                if (!isHittingWall(MoveDirections.UP)){
                    pic.translate(0, -speed);
                }
                return;
            case DOWN:
                if (!isHittingWall(MoveDirections.DOWN)){
                    pic.translate(0, speed);
                }
                return;
            case LEFT:
                if (!isHittingWall(MoveDirections.LEFT)) {
                    pic.load(pathLeft);
                    pic.translate(-(speed), 0);
                }
                return;
            case RIGHT:
                if (!isHittingWall(MoveDirections.RIGHT)) {
                    pic.load(pathRigth);
                    pic.translate(speed, 0);
                }
        }
    }
}
