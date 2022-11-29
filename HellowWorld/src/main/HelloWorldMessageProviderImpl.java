package main;

public class HelloWorldMessageProviderImpl implements MessageProvider {
	String message = "Message Provider -------";
	@Override
	public String getMessage() {
		return message;
	}
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	

}
