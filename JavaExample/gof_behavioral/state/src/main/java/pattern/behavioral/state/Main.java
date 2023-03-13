package pattern.behavioral.state;

public class Main {

	public static void main(String[] args) {
		System.out.println("State Pattern Study");

		MediaPlayerContext context = new MediaPlayerContext();

		// 초기 상태 - StatePause
		context.pressPlayButton();

		// StatePlay 로 변경
		context.setState(new StatePlay());
		context.pressPlayButton();

		// 다시 StatePause 로 변경
		context.setState(new StatePause());
		context.pressPlayButton();
	}
}