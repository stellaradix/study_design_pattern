package pattern.behavioral.interpreter;

// 스크립트를 구성하는 구문을 처리하는 인터페이스
public interface Expression {

	boolean parse(Context context);

	boolean run();
}
