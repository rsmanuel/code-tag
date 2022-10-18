package org.academiadecodigo.bootcamp.codetag.game;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


    public class Music {
        private Clip clip;

        public void startMusic(String pathStr) {
            URL soundURL;
            AudioInputStream audio = null;
            try {
                soundURL = Game.class.getResource(pathStr);
                if(soundURL == null) {
                    pathStr = pathStr.substring(1);
                    File file = new File(pathStr);
                    soundURL = file.toURI().toURL();
                }
                audio = AudioSystem.getAudioInputStream(soundURL);
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(clip.LOOP_CONTINUOUSLY);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        public void stopMusic(){
            clip.stop();
        }
    }
