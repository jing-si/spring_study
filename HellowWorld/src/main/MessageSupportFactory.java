package main;

import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;
	
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;
	
	private MessageSupportFactory() {
		props = new Properties();
		
		try {
			props.load(this.getClass().getResourceAsStream("msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static {
		instance = new MessageSupportFactory();		
	}
	
	public static MessageSupportFactory getInstacne() {
		return instance;
	}

	public MessageRenderer getRenderer() {
		return renderer;
	}

	public MessageProvider getProvider() {
		return provider;
	}
	
	
	
	
}
