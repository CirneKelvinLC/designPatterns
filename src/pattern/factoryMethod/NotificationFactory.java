package pattern.factoryMethod;


public class NotificationFactory {
	
	public Notification create(String notificationType) {
		switch(notificationType.toLowerCase()) {
			case "authenticator":
				return new AuthenticatorNotification();
			case "email":
				return new EmailNotification();
			case "sms":
				return new SMSNotification();
			case "whatsapp":
				return new WhatsAppNotification();
			default:
				throw new IllegalArgumentException("Invalid notification type!");
		}
		
	}

}
