package org.academiadecodigo.bootcamp.codetag.game;

import org.academiadecodigo.bootcamp.codetag.characters.*;
import org.academiadecodigo.bootcamp.codetag.map.Base;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Game implements KeyboardHandler {
    public static boolean isRunning = false;

    private final Picture gameMenu;

    private final Keyboard keyboard;


    public Game(){
        gameMenu = new Picture(0, 0, "pics/sets/menu.png");
        this.keyboard = new Keyboard(this);
        initKeyboard();
    }

    public void initKeyboard(){
        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);
    }

    public void gameMenu() {
        gameMenu.draw();
    }

    public void gameInit() throws InterruptedException {
        Base map = new Base();
        map.init();
        int random = Randomizer.getRandomRange(0, 3);

        Characters player;
        switch (random){
            case 0:
                player = new Rodrigo42(map);
                break;
            case 2:
                player = new Mike42(map);
                break;
            default:
                player = new Teresa42(map);
        }
        AcademiaDeCodigo[] academiaDeCodigo = new AcademiaDeCodigo[10];
        academiaDeCodigo[0] = new Gabi(map);
        academiaDeCodigo[1] = new Bri(map);
        academiaDeCodigo[2] = new Gee(map);
        academiaDeCodigo[3] = new Fanuca(map);
        academiaDeCodigo[4] = new Cat(map);
        academiaDeCodigo[5] = new Miguel(map);
        academiaDeCodigo[6] = new Zuca(map);
        academiaDeCodigo[7] = new Diogo(map);
        academiaDeCodigo[8] = new Pedro(map);
        academiaDeCodigo[9] = new Mariana(map);

        int i = 0;
        while(i <= 2){
            i++;
            Thread.sleep(750);
        }
        for (AcademiaDeCodigo character: academiaDeCodigo) {
            character.move();
        }
        Score score = new Score();
        while (isRunning){
            if (isTouchingAc(academiaDeCodigo, player)){
                isRunning = false;
                score.save();
                Picture gameOver = new Picture(0, 0, "pics/sets/gameover.png");
                gameOver.draw();
                Game.sound.stopMusic();
            }
        }
    }

    public static Music sound;

    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        Game game = new Game();
        sound = new Music();
        sound.startMusic("/pics/ES_Back to Business - William Benckert.wav");
        while(!Game.isRunning){
            game.gameMenu();
        }
        game.gameInit();
    }

    public boolean isTouchingAc(AcademiaDeCodigo[] characters, Characters player){
        for(AcademiaDeCodigo character : characters){
            int lx_c = character.getPic().getX();
            int rx_c = character.getPic().getMaxX();
            int ty_c = character.getPic().getY();
            int by_c = character.getPic().getMaxY();
            int lx_p = player.getPic().getX();
            int rx_p = player.getPic().getMaxX();
            int ty_p = player.getPic().getY();
            int by_p = player.getPic().getMaxY();

            if((rx_p > lx_c && rx_p < rx_c && (ty_p > ty_c && ty_p < by_c || by_p > ty_c && by_p < by_c)) ||
                    (lx_p < rx_c && lx_p > lx_c && (ty_p > ty_c && ty_p < by_c || by_p > ty_c && by_p < by_c))){
                return true;
            }

        }
        return false;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE && !isRunning){
            isRunning = true;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
