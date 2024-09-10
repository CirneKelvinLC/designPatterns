package pattern.factoryMethodV2;

public class SMSNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Sending SMS notification!");

	}

}
