package pattern.behavioral.state;

public class StatePause implements State {

	@Override
	public void pressPlay() {
		System.out.println("Resumed the media player.");
	}
}
