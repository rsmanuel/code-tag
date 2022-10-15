package org.academiadecodigo.bootcamp.project.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.io.*;

public class Score {

    private String highScore;

    private int score;

    private BufferedReader br;

    private BufferedWriter bw;

    private FileReader in;

    private Text text;

    private Text text2;

    public Score() {
        score = 1;
        text2 = new Text(400, 50, String.valueOf(score));
        text2.setColor(Color.WHITE);
        text2.grow(8, 8);
        text2.draw();
        try {
            in = new FileReader("./resources/high_score.txt");
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
            bw  = new BufferedWriter(new FileWriter("./resources/high_score.txt"));
            bw.write(String.valueOf(score));
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void read() throws IOException {
        highScore = br.readLine();
        text = new Text(720, 50, "HighScore: " + highScore);
        text.setColor(Color.WHITE);
        text.draw();
        text.grow(50, 20);
    }
}
