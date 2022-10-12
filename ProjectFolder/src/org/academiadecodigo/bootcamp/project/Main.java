package org.academiadecodigo.bootcamp.project;
import org.academiadecodigo.bootcamp.project.characters.Bri;
import org.academiadecodigo.bootcamp.project.characters.Diogo;
import org.academiadecodigo.bootcamp.project.characters.Rodrigo;
import org.academiadecodigo.bootcamp.project.characters.Zuca;
import org.academiadecodigo.bootcamp.project.map.Base;
import org.academiadecodigo.bootcamp.project.map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        Map map = new Base();
        Bri bri = new Bri(map);

    }
}