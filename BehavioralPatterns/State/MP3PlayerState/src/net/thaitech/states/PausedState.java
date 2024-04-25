package net.thaitech.states;

import net.thaitech.main.MP3PlayerContext;

public class PausedState implements State {
    private MP3PlayerContext player;

    public PausedState(MP3PlayerContext player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("Resuming music.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the player from paused state.");
        player.setState(new StoppedState(player));
    }
}
