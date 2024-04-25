package net.thaitech.main;

public class PlayingState implements State {
    @Override
    public void pressPlay(MP3PlayerContext context) {
        System.out.println("Pausing...");
        context.setState(new PausedState());
    }
}
