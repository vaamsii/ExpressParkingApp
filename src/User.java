
public class User {
	public String firstname;
	public String lastname;
	public int id;
	public String email;
	public String password;
	public boolean loginStatus;
	public int officeID;

	
	public User(String firstname, String lastname, int id, String email, String password, boolean loginStatus, int officeID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.email = email;
		this.password = password;
		this.loginStatus = loginStatus;
		this.officeID = officeID;
	}
	
	public int getOfficeID() {
		return officeID;
	}

	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}

	public User(){
		super();
	}
	

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}

	public void setLastName(String name) {
		this.lastname = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public boolean getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean LoginStatus) {
		this.loginStatus = LoginStatus;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	


	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + ", email=" + email + ", password=" + password +  ", loginstatus=" + loginStatus +   ", officeID=" + officeID +"]";
	}
	
}
