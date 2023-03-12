package pattern.behavioral.observer;

public class ObserverWeatherCondition implements ObserverInterface {

	private String name;

	public ObserverWeatherCondition(String name) {
		this.name = name;
	}

	public ObserverWeatherCondition(String name, SubjectInterface subject) {
		this(name);
		subject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("\n" + name);
		System.out.println("현재 온도: " + temperature + " 도, 습도: " + humidity + " %, 기압: " + pressure + " hPa");
	}
}
