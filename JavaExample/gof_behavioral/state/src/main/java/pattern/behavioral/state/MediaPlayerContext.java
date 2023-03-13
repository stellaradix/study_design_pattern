package pattern.behavioral.state;

public class MediaPlayerContext {

	private State state;

	public MediaPlayerContext() {
		state = new StatePause();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void pressPlayButton() {
		state.pressPlay();
	}
}
