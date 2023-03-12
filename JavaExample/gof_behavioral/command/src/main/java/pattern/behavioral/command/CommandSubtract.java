package pattern.behavioral.command;

public class CommandSubtract implements Command {

	private Calculator calculator;
	private int operand;

	public CommandSubtract(Calculator calculator, int operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.subtract(operand);
	}
}
