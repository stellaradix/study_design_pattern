package pattern.behavioral.chain_responsibility;

public class ConcreteHandler1 implements Handler {

	private Handler nextHandler;

	@Override
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.TYPE1) {
			System.out.println("ConcreteHandler1 handles the request");
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(request);
			} else {
				System.out.println("All handlers are busy");
			}
		}
	}
}
