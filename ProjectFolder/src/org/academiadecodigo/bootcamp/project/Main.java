package org.academiadecodigo.bootcamp.project;

import org.academiadecodigo.bootcamp.project.characters.*;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map map = new Base();
        Mike42 mike = new Mike42(map);
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
    }
}