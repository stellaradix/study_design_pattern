package pattern.behavioral.strategy;

public class ConcreteStractegySword implements AbstractStrategy{

	@Override
	public void attack() {
		System.out.println("검 공격");
	}
}
