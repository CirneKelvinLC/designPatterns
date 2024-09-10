package pattern.factoryMethod;

public class WhatsAppNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Sending WhatsApp notification!");

	}

}
