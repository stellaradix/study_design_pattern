package pattern.behavioral.state;

public class StatePlay implements State {

	@Override
	public void pressPlay() {
		System.out.println("Pause the media player.");
	}
}
