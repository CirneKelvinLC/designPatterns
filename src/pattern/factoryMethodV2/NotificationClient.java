package pattern.factoryMethodV2;

import java.util.Objects;
import java.util.Scanner;

public class NotificationClient {
	
	private static NotificationFactory factory;
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getNotification(sc.next());
			runSendNotification();			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
        
    }
	
	
	private static void getNotification(String type) {
		if(Objects.isNull(type) || type.trim().isBlank()) {
			throw new IllegalArgumentException("Invalid type!");
		}
		
		String lowerCaseType = type.toLowerCase();
		
		if("authenticator".equals(lowerCaseType)) {
			factory = new AuthenticatorFactory();
		}
		
		if("email".equals(lowerCaseType)) {
			factory = new EmailFactory();
		}
		
		if("sms".equals(lowerCaseType)) {
			factory = new SMSFactory();
		}
		
		if("whatsapp".equals(lowerCaseType)) {
			factory = new WhatsAppFactory();
		}
		
		else {
			throw new IllegalArgumentException("Invalid type!");
		}
	}
	
	private static void runSendNotification() {
		factory.sendNotification();
	}

}
