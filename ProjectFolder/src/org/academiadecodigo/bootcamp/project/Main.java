package org.academiadecodigo.bootcamp.project;

import org.academiadecodigo.bootcamp.project.characters.Bri;
import org.academiadecodigo.bootcamp.project.characters.Mariana;
import org.academiadecodigo.bootcamp.project.characters.Mike42;
import org.academiadecodigo.bootcamp.project.characters.Zuca;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new Base();
        Mike42 mikeCA = new Mike42(map);
        Bri bri = new Bri(map);
        Mariana mariana = new Mariana(map);
        Zuca zuca = new Zuca(map);
    }
}