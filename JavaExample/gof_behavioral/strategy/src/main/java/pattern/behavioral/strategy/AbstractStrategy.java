package pattern.behavioral.strategy;

// 전략(Strategy) 인터페이스
public interface AbstractStrategy {

	// 구현 클래스에서 정의할 메서드 - 클래스가 이용할 알고리즘을 정의하는 부분
	void attack();
}
