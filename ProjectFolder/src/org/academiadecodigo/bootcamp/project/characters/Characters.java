package org.academiadecodigo.bootcamp.project.characters;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;
import javafx.scene.control.Tab;
import org.academiadecodigo.bootcamp.project.directions.MoveDirections;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.bootcamp.project.map.Tables;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;

abstract public class Characters {
    private String pathLeft;
    private String pathRight;
    private Picture pic;
    private int speed;
    private Map level;

    private Tables tables;

    public Characters(String pathLeft, String pathRight, Picture pic, int speed, Map level){
        this.pathLeft = pathLeft;
        this.pathRight = pathRight;
        this.pic = pic;
        this.level = level;
        this.speed = speed;
        this.tables = new Tables();
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
    public boolean isHittingTables(MoveDirections direction){
        for(String table : this.tables){
            Integer[] pos = tables.get(table);
            int lx = pos[0];
            int rx = pos[1];
            int ty = pos[2];
            int by = pos[3];

            /*if((pic.getY() - speed) < by && (pic.getMaxY() - speed) > ty && (pic.getMaxX() + speed) > lx
                    && (pic.getX() - speed) < rx){
                return true;
            }*/
            if((pic.getY() - speed) < by && pic.getY() - speed > ty && pic.getMaxX() > lx && pic.getX() < rx && direction == MoveDirections.UP){
                pic.translate(0, -(pic.getY() - by));
                return true;
            }
            else if(pic.getMaxY() + speed > ty && pic.getMaxY() < by && pic.getX() > lx && pic.getMaxX() < rx && direction == MoveDirections.DOWN){
                pic.translate(0, ty - pic.getMaxY() + 5);
                return true;
            }
            else if((pic.getX() - speed) < rx && pic.getY() > ty && pic.getMaxY() < by && (pic.getX() - speed > lx) && direction == MoveDirections.LEFT){
                pic.load(pathLeft);
                pic.translate(-(pic.getX() - rx), 0);
                return true;
            }
            else if((pic.getMaxX() + speed) > lx && pic.getY() > ty && pic.getMaxY() < by && (pic.getMaxX() + speed < rx) && direction == MoveDirections.RIGHT){
                pic.load(pathRight);
                pic.translate(lx - pic.getMaxX() + 5, 0);
                return true;
            }
        }
        return false;
    }

    public void moveUp(){
        int upWall = 135;

        if(isHittingTables(MoveDirections.UP)){
            return;
        }

        pic.translate(0, isHittingWall(MoveDirections.UP) ? (pic.getY() > upWall ? -(pic.getY() - upWall) : 0) : -(speed));
    }

    public void moveDown(){
        int downWall = level.getBackground().getHeight() - 14;
        if(isHittingTables(MoveDirections.DOWN)){
            return;
        }

        pic.translate(0, isHittingWall(MoveDirections.DOWN) ? (pic.getMaxY() < downWall ? (downWall - pic.getMaxY()) : 0) : speed);
    }

    public void moveLeft(){
        int leftWall = 14;
        if(isHittingTables(MoveDirections.LEFT)){
            return;
        }

        pic.load(pathLeft);
        pic.translate(isHittingWall(MoveDirections.LEFT) ? (pic.getX() > leftWall ? -(pic.getX() - leftWall) : 0) : -(speed), 0);
    }

    public void moveRight(){
        int rightWall = level.getBackground().getWidth() - 14;
        if(isHittingTables(MoveDirections.RIGHT)){
            return;
        }

        pic.load(pathRight);
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
