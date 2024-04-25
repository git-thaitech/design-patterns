package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        MP3PlayerContext player = new MP3PlayerContext();
        
        player.pressPlay(); // Playing...
        player.pressPlay(); // Pausing...
        player.pressPlay(); // Playing...
    }
}

