package main;

public class HalloWorldDecoupled {

	public static void main(String[] args) {
		MessageProvider mp = MessageSupportFactory.getInstacne().getProvider();
		MessageRenderer mr = MessageSupportFactory.getInstacne().getRenderer();
		mp.setMessage("저렇게 저렇게");
		mr.setMessageProvider(mp);
		mr.render();
		
		
		
	}

}
