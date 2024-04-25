package net.thaitech.states;

import net.thaitech.main.*;

public class StoppedState implements State {
    private MP3PlayerContext player;

    public StoppedState(MP3PlayerContext player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("Starting the player.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pressStop() {
        System.out.println("The player is already stopped.");
    }
}
