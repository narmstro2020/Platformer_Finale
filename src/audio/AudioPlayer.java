package audio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class AudioPlayer {

    public static int MENU_1 = 0;
    public static int LEVEL_1 = 1;
    public static int LEVEL_2 = 2;

    public static int DIE = 0;
    public static int JUMP = 1;
    public static int GAMEOVER = 2;
    public static int LVL_COMPLETED = 3;
    public static int ATTACK_ONE = 4;
    public static int ATTACK_TWO = 5;
    public static int ATTACK_THREE = 6;

    private Clip[] songs, effects;
    private int currentSongId;
    private float volume = 0.5f;
    private boolean songMute, effectMute;
    private Random rand = new Random();

    public AudioPlayer() {
        // TODO: coming soon
    }

    private void loadSongs() {
        // TODO: coming soon
    }

    private void loadEffects() {
        // TODO: coming soon

    }

    private Clip getClip(String name) {
        // TODO: coming soon
        return null;

    }

    public void setVolume(float volume) {
        // TODO: coming soon
    }

    public void stopSong() {
        // TODO: coming soon
    }

    public void setLevelSong(int lvlIndex) {
        // TODO: coming soon
    }

    public void lvlCompleted() {
        // TODO: coming soon
    }

    public void playAttackSound() {
        // TODO: coming soon
    }

    public void playEffect(int effect) {
        // TODO: coming soon
    }

    public void playSong(int song) {
        // TODO: coming soon
    }

    public void toggleSongMute() {
        // TODO: coming soon
    }

    public void toggleEffectMute() {
        // TODO: coming soon
    }

    private void updateSongVolume() {

        // TODO: coming soon

    }

    private void updateEffectsVolume() {
        // TODO: coming soon
    }

}
