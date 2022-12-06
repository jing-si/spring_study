package main;

public class HalloWorldDecoupled {

	public static void main(String[] args) {
		MessageProvider mp = new HelloWorldMessageProviderImpl();
		MessageRenderer mr = new MessageRendererImpl();
		mp.setMessage("저렇게 저렇게");
		mr.setMessageProvider(mp);
		mr.render();		
				
	}

}
