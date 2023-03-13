package pattern.behavioral.interpreter;

public abstract class ExpressionCommand implements Expression {

	protected String keyword;

	public ExpressionCommand(String keyword) {
		this.keyword = keyword;
	}
}
