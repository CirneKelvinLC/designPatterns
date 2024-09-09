package pattern.builder;

public class UserProfileBuilder{
	

	public static class Builder {
		//required fields
		private String identityCard;
		private String username;
		private int age;
		private String email;
		
		//optional fields 
		private String address;
		private String phoneNumber;
		private String name;
		private String alternativeEmail;
		
		public UserProfileBuilder build() {
			return new UserProfileBuilder(this);
		}
		
		public Builder getIdentityCard(String identityCard) {
			this.identityCard = identityCard;
			return this;
		}
		public Builder getUsername(String username) {
			this.username = username;
			return this;
		}
		public Builder getAge(int age) {
			this.age = age;
			return this;
		}
		public Builder getEmail(String email) {
			this.email = email;
			return this;
		}
		public Builder getAddress(String address) {
			this.address = address;
			return this;
		}
		public Builder getPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		public Builder getName(String name) {
			this.name = name;
			return this;
		}
		public Builder getAlternativeEmail(String alternativeEmail) {
			this.alternativeEmail = alternativeEmail;
			return this;
		}
		
		
	}	
	
	public final String identityCard;
	private final String username;
	private final int age;
	private final String email;
	
	//optional fields 
	private final String address;
	private final String phoneNumber;
	private final String name;
	private final String alternativeEmail;
	
	private UserProfileBuilder(Builder builder) {
		// TODO Auto-generated constructor stub
		this.identityCard = builder.identityCard;
		this.username = builder.username;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
		this.name = builder.name;
		this.alternativeEmail = builder.alternativeEmail;
	}
	
}
