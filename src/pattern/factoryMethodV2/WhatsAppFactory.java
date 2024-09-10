package pattern.factoryMethodV2;

public class WhatsAppFactory extends NotificationFactory {

	@Override
	public Notification createNotification() {
		return new WhatsAppNotification();
	}

}
