package net.thaitech.main;

import net.thaitech.states.*;

public class MP3PlayerContext {
    private State state;

    public MP3PlayerContext() {
        this.state = new StoppedState(this); // Default state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay();
    }

    public void pressStop() {
        state.pressStop();
    }
}
