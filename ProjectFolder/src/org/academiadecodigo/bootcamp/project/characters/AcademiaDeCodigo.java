package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class AcademiaDeCodigo extends Characters {

    public AcademiaDeCodigo(String pathLeft, String pathRight, Picture pic, int speed, Map level, boolean isAc) throws InterruptedException {
        super(pathLeft, pathRight, pic, speed, level, isAc);
    }

    public void move() throws InterruptedException {

        Thread tr = new Thread(() -> {

        while (true) {


                int changeDirection = (int) Math.ceil(Math.random() * 100);
                int moveRandom;


                if (changeDirection > 80) {
                    while ((moveRandom = (int) Math.ceil(Math.random() * 4)) == 1) {
                        super.moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while ((moveRandom = (int) Math.ceil(Math.random() * 4)) == 2) {
                        super.moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while ((moveRandom = (int) Math.ceil(Math.random() * 4)) == 3) {
                        super.moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while ((moveRandom = (int) Math.ceil(Math.random() * 4)) == 4) {
                        super.moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        super.moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }}
        });
        tr.start();
    }
}
