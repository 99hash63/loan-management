package user;

public class User {

	String userName;
	String password; 
	String firstName; 
	String lastName; 
	String age; 
	String contact; 
	String email; 
	String address;
	
	public User(String userName, String password, String firstName, String lastName, String age, String contact,
			String email, String address) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getContact() {
		return contact;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}

}