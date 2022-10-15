package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.directions.MoveDirections;
import org.academiadecodigo.bootcamp.project.game.Game;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class QuarentaEDois extends Characters implements KeyboardHandler {

    private Keyboard keyboard;
    public QuarentaEDois(String pathLeft, String pathRight, int speed, Map level) {
        super(pathLeft, pathRight, new Picture(500, 500, pathRight), speed, level);
        this.keyboard = new Keyboard(this);
        initKeyboard();
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
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT && Game.isRunning){
            move(MoveDirections.RIGHT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT && Game.isRunning) {
            move(MoveDirections.LEFT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP && Game.isRunning) {
            move(MoveDirections.UP);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN && Game.isRunning) {
            move(MoveDirections.DOWN);
        }
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
