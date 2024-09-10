package pattern.factoryMethodV2;

public class AuthenticatorNotification implements Notification{

	@Override
	public void send() {
		System.out.println("Sending authenticator notification!");
		
	}

}
