package pattern.behavioral.interpreter;

import java.util.StringTokenizer;

// 스크립트에서 구문을 뽑아내는 기능
public class Context {

	private StringTokenizer tokenizer;

	private String currentKeyword;

	public Context(String script) {
		tokenizer = new StringTokenizer(script);
		readNextKeyword();
	}

	public String readNextKeyword() {
		if (tokenizer.hasMoreTokens()) {
			currentKeyword = tokenizer.nextToken();
		} else {
			currentKeyword = null;
		}

		return currentKeyword;
	}

	public String getCurrentKeyword() {
		return currentKeyword;
	}
}
