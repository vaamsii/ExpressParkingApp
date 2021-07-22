import java.time.LocalTime;

public class Database {
	
	public String email;
	public int parkingLot;
	public String license;
	public int duration;
	public Boolean paid;
	public int bookID;
	public Boolean validated;
	public String time;
	
	public Database(String email, int parkingLot, String license, int duration, Boolean paid, int bookID, Boolean validated, String time) {
		super();
		this.email = email;
		this.parkingLot = parkingLot;
		this.license = license;
		this.duration = duration;
		this.paid = paid;
		this.bookID = bookID;
		this.validated = validated;
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Database(){
		super();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getbookID() {
		return bookID;
	}

	public void setbookID(int bookID) {
		this.bookID = bookID;
	}
	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}
	public int getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(int parkingLot) {
		this.parkingLot = parkingLot;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Database [parkingLot=" + parkingLot + ", license=" + license + ", duration=" + duration + ", paid=" + paid +", bookID=" + bookID +", email=" + email + ", validated=" + validated +", time=" + time + "]";
	}

}
