package pattern.factoryMethodV2;

import java.util.Scanner;

public class NotificationClient {
	
	private static NotificationFactory factory;
	
	private static final String AUTHENTICATOR = "authenticator";
	private static final String EMAIL = "email";
	private static final String SMS = "sms";
	private static final String WHATSAPP = "whatsapp";
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getNotificationFactory(sc.next());
			runSendNotification();			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
        
    }
	
	
	private static void getNotificationFactory(String type) {
		switch(type) {
			case AUTHENTICATOR:
				factory = new AuthenticatorFactory();
			case EMAIL:
				factory = new EmailFactory();
			case SMS:
				factory = new SMSFactory();
			case WHATSAPP:
				factory = new WhatsAppFactory();
			default:
				throw new IllegalArgumentException("Invalid type!");
				
		}
	}
	
	private static void runSendNotification() {
		factory.sendNotification();
	}

}
