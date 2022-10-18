package org.academiadecodigo.bootcamp.codetag.characters;

import org.academiadecodigo.bootcamp.codetag.directions.MoveDirections;
import org.academiadecodigo.bootcamp.codetag.game.Game;
import org.academiadecodigo.bootcamp.codetag.game.Randomizer;
import org.academiadecodigo.bootcamp.codetag.map.Map;
import org.academiadecodigo.bootcamp.codetag.map.Tables;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class QuarentaEDois extends Characters implements KeyboardHandler {

    private Keyboard keyboard;

    private Tables tables;
    public QuarentaEDois(String pathLeft, String pathRight, int speed, Map level) {
        super(pathLeft, pathRight, new Picture(Randomizer.getRandomRange(14, 280), Randomizer.getRandomRange(135, level.getBackground().getHeight() - 14 - 50), pathRight), speed, level);
        this.keyboard = new Keyboard(this);
        initKeyboard();
        this.tables = new Tables();
    }

    private void initKeyboard(){
        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(down);
        keyboard.addEventListener(up);
    }

    public void keyPressed(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }

    private void move(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT && Game.isRunning && !isHittingTables(MoveDirections.RIGHT)){
            move(MoveDirections.RIGHT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT && Game.isRunning && !isHittingTables(MoveDirections.LEFT)) {
            move(MoveDirections.LEFT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP && Game.isRunning && !isHittingTables(MoveDirections.UP)) {
            move(MoveDirections.UP);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN && Game.isRunning && !isHittingTables(MoveDirections.DOWN)) {
            move(MoveDirections.DOWN);
        }
    }

    public boolean isHittingTables(MoveDirections direction){
        for(String table : this.tables){
            Integer[] pos = tables.get(table);
            int lx = pos[0];
            int rx = pos[1];
            int ty = pos[2];
            int by = pos[3];

            if((super.getPic().getY() - super.getSpeed()) < by && super.getPic().getY() - super.getSpeed() - super.getSpeed() > ty && super.getPic().getX() > lx && super.getPic().getMaxX() < rx && direction == MoveDirections.UP){
                super.getPic().translate(0, -(super.getPic().getY() - by));
                return true;
            }
            else if(super.getPic().getMaxY() + super.getSpeed() > ty && super.getPic().getMaxY() < by && super.getPic().getX() > lx && super.getPic().getMaxX() < rx && direction == MoveDirections.DOWN){
                super.getPic().translate(0, ty - super.getPic().getMaxY() + 5);
                return true;
            }
            else if((super.getPic().getX() - super.getSpeed()) < rx && super.getPic().getY() > ty && super.getPic().getMaxY() < by && (super.getPic().getX() - super.getSpeed() > lx) && direction == MoveDirections.LEFT){
                super.getPic().load(super.pathLeft);
                super.getPic().translate(-(super.getPic().getX() - rx), 0);
                return true;
            }
            else if((super.getPic().getMaxX() + super.getSpeed()) > lx && super.getPic().getY() > ty && super.getPic().getMaxY() < by && (super.getPic().getMaxX() + super.getSpeed() < rx) && direction == MoveDirections.RIGHT){
                super.getPic().load(pathRight);
                super.getPic().translate(lx - super.getPic().getMaxX() + 5, 0);
                return true;
            }
        }
        return false;
    }

    public void move(MoveDirections directions) {
        switch (directions){
            case UP:
                moveUp();
                return;
            case DOWN:
                moveDown();
                return;
            case LEFT:
                moveLeft();
                return;
            case RIGHT:
                moveRight();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }
}
