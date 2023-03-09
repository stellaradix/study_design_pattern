package pattern.behavioral.template_method;

abstract public class Beverage {

	// 뼈대 메서드 - 공통으로 사용되는 메서드
	// 외부에서 접근할 수는 있지만 변경 불가능
	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	// 하위 클래스에서도 변경하지 않을 메서드
	private void boilWater() {
		System.out.println("물을 끓입니다.");
	}

	// 구현 클래스에서 정의될 추상 메서드
	public abstract void brew();

	// 하위 클래스에서도 변경하지 않을 메서드
	private void pourInCup() {
		System.out.println("컵에 따르는 중입니다.");
	}

	// 구현 클래스에서 정의될 추상 메서드
	public abstract void addCondiments();
}
