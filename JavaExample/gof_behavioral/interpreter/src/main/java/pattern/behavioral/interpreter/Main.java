package pattern.behavioral.interpreter;

public class Main {

	public static void main(String[] args) {
		System.out.println("Interpreter Pattern Study");

		// Script 예시: BEGIN FRONT LOOP 2 BACK RIGHT END BACK END
		String script = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";
		System.out.println(script);

		Context context = new Context(script);
		Expression expression = new ExpressionBegin();

		if (expression.parse(context)) {
			System.out.println(expression);
		}
	}
}