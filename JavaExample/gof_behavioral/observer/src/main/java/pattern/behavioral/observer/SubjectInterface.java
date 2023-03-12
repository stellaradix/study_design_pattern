package pattern.behavioral.observer;

public interface SubjectInterface {

	public void registerObserver(ObserverInterface observer);

	public void removeObserver(ObserverInterface observer);

	public void notifyObservers();
}
