package org.academiadecodigo.bootcamp.project.game;

import org.academiadecodigo.bootcamp.project.characters.*;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;

public class Game {
    public static boolean isRunning = false;

    public static void main(String[] args) throws InterruptedException {
        Map map = new Base();
        isRunning = true;
        int random = Randomizer.getRandomRange(0, 3);
        Characters player;
        Game game = new Game();
        Score score = new Score();

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
        AcademiaDeCodigo[] academiaDeCodigo= new AcademiaDeCodigo[10];
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

        for (AcademiaDeCodigo character: academiaDeCodigo) {
            character.move();
        }

        while (isRunning){
            System.out.println(game.isTouchingAc(academiaDeCodigo, player));
            if (game.isTouchingAc(academiaDeCodigo, player)){
                Game.isRunning = false;
                score.save();
            }
        }

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
}
