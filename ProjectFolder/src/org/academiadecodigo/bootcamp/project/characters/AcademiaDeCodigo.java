package org.academiadecodigo.bootcamp.project.characters;

import org.academiadecodigo.bootcamp.project.game.Randomizer;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class AcademiaDeCodigo extends Characters {

    public AcademiaDeCodigo(String pathLeft, String pathRight, Picture pic, int speed, Map level, boolean isAc) throws InterruptedException {
        super(pathLeft, pathRight, pic, speed, level, isAc);
    }

    public void move() {

        Thread tr = new Thread(() -> {
            while (true){
                int random = Randomizer.getRandomRange(1, 40);
                if(random > 0 && random < 11){
                    while(Randomizer.getRandomRange(1, 10) < 8){
                        moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    continue;
                }
                if(random > 10 && random < 21){
                    while(Randomizer.getRandomRange(1, 10) < 8){
                        moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    continue;
                }
                if(random > 20 && random < 31){
                    while(Randomizer.getRandomRange(1, 10) < 8){
                        moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    continue;
                }
                if(random > 30 && random < 41){
                    while(Randomizer.getRandomRange(1, 10) < 8){
                        moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
        tr.start();
        /*while (true) {
                int changeDirection = (int) Math.ceil(Math.random() * 100);

                if (changeDirection > 80) {
                    while ((int) Math.ceil(Math.random() * 4) == 1) {
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
                    while (((int) Math.ceil(Math.random() * 4)) == 2) {
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
                    while (((int) Math.ceil(Math.random() * 4)) == 3) {
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
                    while (((int) Math.ceil(Math.random() * 4)) == 4) {
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
        tr.start();*/
    }
}
