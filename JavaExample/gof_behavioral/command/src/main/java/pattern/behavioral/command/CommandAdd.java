package pattern.behavioral.command;

public class CommandAdd implements Command {

	private Calculator calculator;
	private int operand;

	public CommandAdd(Calculator calculator, int operand) {
		this.calculator = calculator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.add(operand);
	}
}
