package pattern.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Observer Pattern Study");

		// subject 객체 생성
		SubjectWeather weather = new SubjectWeather();

		// observer1 객체는 생성 후 subject 객체에 등록
		ObserverInterface observer1 = new ObserverWeatherCondition("옵저버1");
		weather.registerObserver(observer1);

		// subject 상태 변화 때 observer 객체에 notify: observer1 에 notify
		weather.setMeasurements(25, 30, 1005);

		// observer2 객체는 생성자에서 subject 에 등록
		ObserverInterface observer2 = new ObserverWeatherCondition("옵저버2", weather);

		// subject 상태 변화 때 observer 객체에 notify: observer1, observer2 에 notify
		weather.setMeasurements(18, 45, 998);

		// subject 객체에서 observer1 객체를 관찰 제거
		weather.removeObserver(observer1);

		// subject 상태 변화 때 observer 객체에 notify: observer2 에 notify
		weather.setMeasurements(30, 75, 980);
	}
}