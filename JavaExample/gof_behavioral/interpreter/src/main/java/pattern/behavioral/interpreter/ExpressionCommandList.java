package pattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpressionCommandList implements Expression {

	private ArrayList<ExpressionCommand> commands = new ArrayList<>();

	@Override
	public boolean parse(Context context) {

		while (true) {
			String currentKeyword = context.getCurrentKeyword();

			if (currentKeyword == null) {
				return false;
			}

			if (currentKeyword.equals("END")) {
				context.readNextKeyword();
				break;
			}

			ExpressionCommand command = null;

			if (ExpressionCommandLoop.checkValidKeyword(currentKeyword)) {
				command = new ExpressionCommandLoop(currentKeyword);
			}

			if (ExpressionCommandAction.checkValidKeyword(currentKeyword)) {
				command = new ExpressionCommandAction(currentKeyword);
			}

			if (command == null) return false;

			if (command.parse(context)) {
				commands.add(command);
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean run() {
		Iterator<ExpressionCommand> iter = commands.iterator();

		while (iter.hasNext()) {
			boolean bOK = iter.next().run();
			if (!bOK) return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return commands.toString();
	}
}
