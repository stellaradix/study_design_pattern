package pattern.behavioral.template_method;

public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method Pattern Study");

		Coffee coffee = new Coffee();
		System.out.println("\n=== 커피 만들기 ===");
		coffee.prepareBeverage();

		Tea tea = new Tea();
		System.out.println("\n=== 차 만들기 ===");
		tea.prepareBeverage();
	}
}