package pattern.factoryMethodV2;

public class EmailFactory extends NotificationFactory{

	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

}
