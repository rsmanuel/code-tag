package org.academiadecodigo.bootcamp.project;

import org.academiadecodigo.bootcamp.project.characters.*;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map map = new Base();
        Mike42 mike = new Mike42(map);
        AcademiaDeCodigo[] academiaDeCodigo= new AcademiaDeCodigo[6];
        academiaDeCodigo[0] = new Gabi(map);
        academiaDeCodigo[1] = new Bri(map);
        academiaDeCodigo[2] = new Gee(map);
        academiaDeCodigo[3] = new Fanuca(map);
        academiaDeCodigo[4] = new Cat(map);

        for (AcademiaDeCodigo character: academiaDeCodigo) {
            character.move();
        }
    }
}