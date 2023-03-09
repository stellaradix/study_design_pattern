package pattern.behavioral.strategy;

public class ConcreteStrategyKnife implements AbstractStrategy {

	@Override
	public void attack() {
		System.out.println("칼 공격");
	}
}
