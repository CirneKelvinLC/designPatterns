package pattern.factoryMethodV2;

public class SMSFactory extends NotificationFactory {

	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}

}
