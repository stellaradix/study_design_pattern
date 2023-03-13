package pattern.behavioral.interpreter;

public class ExpressionCommandLoop extends ExpressionCommand {

	private int count;

	private ExpressionCommandList expression;

	public ExpressionCommandLoop(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if (!checkValidKeyword(keyword)) return false;

		String countkeyword = context.readNextKeyword();
		if (countkeyword == null) return false;

		try {
			count = Integer.parseInt(countkeyword);

			expression = new ExpressionCommandList();
			if (context.readNextKeyword() == null) return false;

			return expression.parse(context);
		} catch (NumberFormatException e) {
			return false;
		}
	}

	@Override
	public boolean run() {
		for (int i = 0; i < count; i++) {
			if (!expression.run()) {
				return false;
			}
		}

		return true;
	}

	public static boolean checkValidKeyword(String keyword) {
		return keyword.equals("LOOP");
	}

	@Override
	public String toString() {
		return "LOOP(" + count + ") " + expression;
	}
}
