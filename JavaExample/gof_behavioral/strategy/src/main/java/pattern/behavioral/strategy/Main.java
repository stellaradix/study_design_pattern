package pattern.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strategy Pattern Study");

		// 전략을 이용할 클라이언트 객체
		StrategyClientCharacter character = new StrategyClientCharacter();
		// 기본 설정된 전략으로 attack 호출
		character.attack();

		// 전략 교체 - Knife
		character.setWeapon(new ConcreteStrategyKnife());
		// Knife 의 전략 호출
		character.attack();

		// 전략 교체 - Sword
		character.setWeapon(new ConcreteStractegySword());
		// Sword 의 전략 호출
		character.attack();
	}
}