package org.academiadecodigo.bootcamp.project.rodrigo;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rodrigo implements KeyboardHandler {

    private String pathLeft = "./pics/characters/rodrigoLeft.png";

    private String pathRigth = "./pics/characters/rodrigoRight.png";
    private Picture pic;

    private Keyboard keyboard;

    public void move(){
        pic.translate(10, 0);
    }

    public Rodrigo() {
        this.pic = new Picture();
        pic.load(pathLeft);
        pic.draw();
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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }

    private void move(KeyboardEvent keyboardEvent) {
        System.out.println(keyboardEvent.getKey());
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            pic.load(pathRigth);
            pic.translate(10, 0);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            pic.load(pathLeft);
            pic.translate(-10, 0);
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            pic.translate(0, -10);
        } else {
            pic.translate(0, 10);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        move(keyboardEvent);
    }
}
