package pattern.behavioral.command;

public class Calculator {

	private int total = 0;

	public void add(int value) {
		total += value;
	}

	public void subtract(int value) {
		total -= value;
	}

	public int getTotal() {
		return total;
	}
}
