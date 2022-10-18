package org.academiadecodigo.bootcamp.codetag.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.io.*;

public class Score {

    private String highScore;

    private int score;

    private final BufferedReader br;

    private final Text text2;

    public Score() {
        score = 0;
        text2 = new Text(1440/2, (135 - 20) / 2, String.valueOf(score));
        text2.setColor(Color.WHITE);
        text2.grow(text2.getWidth() * 1.2, text2.getHeight() * 1.2);
        text2.draw();
        text2.setColor(new Color(232, 51, 106));
        try {
            FileReader in = new FileReader("src/pics/high_score.txt");
            br = new BufferedReader(in);
            read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread thread = new Thread(() -> {
            while (Game.isRunning) {
                score++;
                text2.setText(String.valueOf(score));
                text2.draw();
                if (score == 10){
                    text2.grow(8, 0);
                } else if(score == 100){
                    text2.grow(8, 0);
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }

    public void save() {
        if (score <= Integer.parseInt(highScore)){
            return;
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/pics/high_score.txt"));
            bw.write(String.valueOf(score));
            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void read() throws IOException {
        highScore = br.readLine();
        Text text = new Text(1100, (135 - 20) / 2, "HighScore: " + highScore);
        text.setColor(Color.WHITE);
        text.draw();
        text.grow(text.getWidth() / 1.5, text.getHeight() / 1.5);
        text.setColor(new Color(123, 186, 69));
    }
}
