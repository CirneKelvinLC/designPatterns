package pattern.builder;

/*
 * This class represents one of the ways to implement 
 * the "Builder" design pattern. 
 * 
 * In this example, the implementation is being done 
 * within the target class itself. 
 * 
 * It solves the problem of 
 * creating complex objects."
 */

public class UserProfile {
	
	//required fields
	private final String identityCard;
	private final String username;
	private int age;
	private String email;
	
	//optional fields 
	private String address;
	private String phoneNumber;
	private String name;
	private String alternativeEmail;
	
	private UserProfile(UserProfileBuilder builder) {
		this.identityCard = builder.identityCard;
		this.username = builder.username;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
		this.name = builder.name;
		this.alternativeEmail = builder.alternativeEmail;
		
	}
	
	public static class UserProfileBuilder {
		
		private String identityCard;
		private String username;
		private int age;
		private String email;
		private String address;
		private String phoneNumber;
		private String name;
		private String alternativeEmail;
		
		public UserProfile build() {
			return new UserProfile(this);
		}
		
		public UserProfileBuilder setIdentityCard(String identityCard) {
			this.identityCard = identityCard;
			return this;
		}
		
		public UserProfileBuilder setUsername(String username) {
			this.username = username;
			return this;
		}
		
		public UserProfileBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public UserProfileBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public UserProfileBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public UserProfileBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public UserProfileBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public UserProfileBuilder setAlternativeEmail(String alternativeEmail) {
			this.alternativeEmail = alternativeEmail;
			return this;
		}
		
	}

	//boilerplate code
	public String getIdentityCard() {
		return identityCard;
	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternativeEmail() {
		return alternativeEmail;
	}

	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}
	
	
	
	
}
