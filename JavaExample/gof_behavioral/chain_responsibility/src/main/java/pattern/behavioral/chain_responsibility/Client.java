package pattern.behavioral.chain_responsibility;

public class Client {

	private Handler handler1;

	private Handler handler2;

	public Client() {
		handler1 = new ConcreteHandler1();
		handler2 = new ConcreteHandler2();

		handler1.setNext(handler2);
	}

	public void makeRequest(RequestType requestType) {
		handler1.handleRequest(new Request(requestType));
	}
}
