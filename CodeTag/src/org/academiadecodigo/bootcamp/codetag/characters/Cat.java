package org.academiadecodigo.bootcamp.codetag.characters;

import org.academiadecodigo.bootcamp.codetag.map.Map;

public class Cat extends AcademiaDeCodigo {
    public Cat (Map level) throws InterruptedException {
        super("pics/characters/catLeft.png", "pics/characters/catRight.png", 20, level);
    }
}
