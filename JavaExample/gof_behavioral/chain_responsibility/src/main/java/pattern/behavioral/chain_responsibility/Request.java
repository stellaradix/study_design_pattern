package pattern.behavioral.chain_responsibility;

public class Request {

	private RequestType requestType;
	private String requestDescription;

	public Request(RequestType requestType) {
		this.requestType = requestType;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public String getRequestDescription() {
		return requestDescription;
	}
}
