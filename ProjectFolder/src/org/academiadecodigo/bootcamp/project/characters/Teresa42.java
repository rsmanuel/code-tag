package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.directions.MoveDirections;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Teresa42 extends Characters implements KeyboardHandler {
    private Keyboard keyboard;

    public Teresa42(Map level) {
        super("./pics/characters/teresa42left.png", "./pics/characters/teresa42Right.png", new Picture(500, 500, "./pics/characters/teresa42Right.png"), 10, level);
        this.keyboard = new Keyboard(this);
        initKeyboard();
    }

    private void initKeyboard(){
        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(down);
        keyboard.addEventListener(up);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }

    private void move(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_D){
            super.move(MoveDirections.RIGHT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
            super.move(MoveDirections.LEFT);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_W) {
            super.move(MoveDirections.UP);
        } else {
            super.move(MoveDirections.DOWN);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }
}

