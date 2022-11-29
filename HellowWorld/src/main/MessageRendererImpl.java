package main;

public class MessageRendererImpl implements MessageRenderer {
	
	private MessageProvider mess;
	
	@Override
	public void render() {
		if(mess == null) {
			throw new RuntimeException(
					"you must set the property messageProvider of class:"
					+ MessageRendererImpl.class.getName()
					);
			
		}
		System.out.println(mess.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		mess = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return mess;
	}

}
