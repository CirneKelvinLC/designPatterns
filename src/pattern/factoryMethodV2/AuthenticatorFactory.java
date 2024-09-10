package pattern.factoryMethodV2;

public class AuthenticatorFactory extends NotificationFactory {

	@Override
	public Notification createNotification() {
		return new AuthenticatorNotification();
	}

}
