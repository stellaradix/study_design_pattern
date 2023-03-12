package pattern.behavioral.chain_responsibility;

public class Main {

	public static void main(String[] args) {
		System.out.println("Chain Responsibility Pattern Study");

		Client client = new Client();

		client.makeRequest(RequestType.TYPE1);
		client.makeRequest(RequestType.TYPE2);
		client.makeRequest(RequestType.TYPE3);
	}
}