package org.academiadecodigo.bootcamp.project.characters;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;
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
        this.speed = speed;
        pic.draw();
    }

    public boolean isHittingWall(MoveDirections directions){
        int upWall = 135;
        int downWall = level.getBackground().getHeight() - 14;
        int leftWall = 14;
        int rightWall = level.getBackground().getWidth() - 14;

        return ((pic.getY() - speed) < upWall && directions == MoveDirections.UP)
                || ((pic.getMaxY() + speed) > downWall && directions == MoveDirections.DOWN)
                || ((pic.getX() - speed) < leftWall && directions == MoveDirections.LEFT)
                || ((pic.getMaxX() + speed) > rightWall && directions == MoveDirections.RIGHT);
    }

    public void moveUp(){
        int upWall = 135;

        pic.translate(0, isHittingWall(MoveDirections.UP) ? (pic.getY() > upWall ? -(pic.getY() - upWall) : 0) : -(speed));
    }

    public void moveDown(){
        int downWall = level.getBackground().getHeight() - 14;

        pic.translate(0, isHittingWall(MoveDirections.DOWN) ? (pic.getMaxY() < downWall ? (downWall - pic.getMaxY()) : 0) : speed);
    }

    public void moveLeft(){
        int leftWall = 14;

        pic.load(pathLeft);
        pic.translate(isHittingWall(MoveDirections.LEFT) ? (pic.getX() > leftWall ? -(pic.getX() - leftWall) : 0) : -(speed), 0);
    }

    public void moveRight(){
        int rightWall = level.getBackground().getWidth() - 14;

        pic.load(pathRigth);
        pic.translate(isHittingWall(MoveDirections.RIGHT) ? (pic.getMaxX() < rightWall ? (rightWall - pic.getMaxX()) : 0) : speed, 0);
    }

    public void move(MoveDirections directions) {
        switch (directions){
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }
    }
}
