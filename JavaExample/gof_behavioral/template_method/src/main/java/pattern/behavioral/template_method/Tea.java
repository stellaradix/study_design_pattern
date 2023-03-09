package pattern.behavioral.template_method;

public class Tea extends Beverage {

	@Override
	public void brew() {
		System.out.println("차를 우려내는 중입니다.");
	}

	@Override
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중입니다.");
	}
}
