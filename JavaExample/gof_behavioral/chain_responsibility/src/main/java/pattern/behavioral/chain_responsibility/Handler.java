package pattern.behavioral.chain_responsibility;

public interface Handler {

	public void setNext(Handler nextHandler);

	public void handleRequest(Request request);
}
