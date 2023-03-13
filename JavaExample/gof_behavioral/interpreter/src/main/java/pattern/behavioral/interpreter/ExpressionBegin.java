package pattern.behavioral.interpreter;

public class ExpressionBegin implements Expression {

	private ExpressionCommandList expression;

	@Override
	public boolean parse(Context context) {

		if (checkValidKeyword(context.getCurrentKeyword())) {
			context.readNextKeyword();

			expression = new ExpressionCommandList();
			return expression.parse(context);
		}

		return false;
	}

	@Override
	public boolean run() {
		return expression.run();
	}

	public static boolean checkValidKeyword(String keyword) {
		return keyword.equals("BEGIN");
	}

	@Override
	public String toString() {
		return "BEGIN " + expression;
	}
}
