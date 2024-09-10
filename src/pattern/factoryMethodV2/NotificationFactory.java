package pattern.factoryMethodV2;


public abstract class NotificationFactory {
	
	public void sendNotification() {
		Notification notification = createNotification();
		notification.send();
	}
	
	public abstract Notification createNotification();

}
