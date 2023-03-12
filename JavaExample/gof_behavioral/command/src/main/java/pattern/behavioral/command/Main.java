package pattern.behavioral.command;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Command Pattern Study");

		Calculator calculator = new Calculator();

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int operand = scanner.nextInt();

		Command addCommand, subtractCommand;
		addCommand = new CommandAdd(calculator, operand);
		subtractCommand = new CommandSubtract(calculator, operand);

		System.out.print("더하기(1), 빼기(2)를 선택하세요: ");
		int commandType = scanner.nextInt();

		if (commandType == 1) {
			addCommand.execute();
		} else if (commandType == 2) {
			subtractCommand.execute();
		}

		System.out.println("총합: " + calculator.getTotal());
	}
}