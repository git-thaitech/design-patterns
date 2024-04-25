package net.thaitech.main;

public class StoppedState implements State {
    @Override
    public void pressPlay(MP3PlayerContext context) {
        System.out.println("Playing...");
        context.setState(new PlayingState());
    }
}
