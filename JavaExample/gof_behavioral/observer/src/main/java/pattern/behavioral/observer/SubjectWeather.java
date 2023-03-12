package pattern.behavioral.observer;

import java.util.ArrayList;

public class SubjectWeather implements SubjectInterface {

	private ArrayList<ObserverInterface> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public SubjectWeather() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(ObserverInterface observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (ObserverInterface observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
