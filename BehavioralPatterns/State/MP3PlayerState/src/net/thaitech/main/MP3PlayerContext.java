package net.thaitech.main;

public class MP3PlayerContext {
    private State state;

    public MP3PlayerContext() {
        state = new StoppedState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this);
    }
}

