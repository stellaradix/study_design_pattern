package pattern.behavioral.strategy;

public class StrategyClientCharacter {

	// 전략에 접근할 접근점
	private AbstractStrategy weapon;

	// 전략 교환 가능
	public void setWeapon(AbstractStrategy weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
			return;
		}

		// 위임 (Delegate)
		weapon.attack();
	}
}
