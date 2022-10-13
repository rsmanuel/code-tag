package org.academiadecodigo.bootcamp.project;

import org.academiadecodigo.bootcamp.project.characters.*;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map map = new Base();
        Mike42 mike = new Mike42(map);
        Teresa42 teresa42 = new Teresa42(map);
        AcademiaDeCodigo[] academiaDeCodigo= new AcademiaDeCodigo[4];
        academiaDeCodigo[0] = new Gabi(map);
        academiaDeCodigo[1] = new Bri(map);
        academiaDeCodigo[2] = new PedroG(map);
        academiaDeCodigo[3] = new Fanuca(map);

        for (AcademiaDeCodigo str: academiaDeCodigo) {
            System.out.println(str);
            str.move();
        }
    }
}