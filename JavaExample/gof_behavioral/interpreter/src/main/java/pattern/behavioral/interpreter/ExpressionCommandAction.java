package pattern.behavioral.interpreter;

public class ExpressionCommandAction extends ExpressionCommand {

	public ExpressionCommandAction(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if (!checkValidKeyword(keyword)) return false;

		if (context.readNextKeyword() == null) return false;

		return true;
	}

	@Override
	public boolean run() {
		System.out.println("cmd: " + keyword);
		return true;
	}

	public static boolean checkValidKeyword(String keyword) {
		boolean bKeywordOk
				= keyword.equals("FRONT") || keyword.equals("BACK")
				|| keyword.equals("LEFT") || keyword.equals("RIGHT");

		return bKeywordOk;
	}

	@Override
	public String toString() {
		return keyword;
	}
}
