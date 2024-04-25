package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        MP3PlayerContext player = new MP3PlayerContext();
        player.pressPlay(); // Should start playing from stopped.
        player.pressPlay(); // Should output already playing.
        player.pressStop(); // Should stop the player.
        player.pressStop(); // Should output already stopped.
    }
}
