package net.thaitech.states;

import net.thaitech.main.MP3PlayerContext;

public class PlayingState implements State {
    private MP3PlayerContext player;

    public PlayingState(MP3PlayerContext player) {
        this.player = player;
    }

    @Override
    public void pressPlay() {
        System.out.println("The player is already playing.");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the player.");
        player.setState(new StoppedState(player));
    }
}
