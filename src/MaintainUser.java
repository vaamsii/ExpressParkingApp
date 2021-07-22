import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainUser {
	public static ArrayList<User> users = new ArrayList<User>();
	public String path;
	public static String emailString;
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()){ 
			User user = new User();
			//name,id,email,password
			user.setFirstName(reader.get("firstname"));
			user.setLastName(reader.get("lastname"));
			user.setId(Integer.valueOf(reader.get("id")));
			user.setEmail(reader.get("email"));
			user.setPassword(reader.get("password"));
			user.setLoginStatus(Boolean.valueOf(reader.get("loginStatus")));
			user.setOfficeID(Integer.valueOf(reader.get("officeID")));
			users.add(user);
		}
	}
	
	public static void emailInput(String emailInp) {
		emailString = emailInp;
	}
	
	public static  void logout(String emailInp) {
		for(User u: users){
			if(u.getEmail().equals(emailInp)) {
				u.setLoginStatus(false);
			}
		}
		
	}
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				//name,id,email,password
				csvOutput.write("firstname");
				csvOutput.write("lastname");
				csvOutput.write("id");
		    	csvOutput.write("email");
				csvOutput.write("password");
				csvOutput.write("loginStatus");
				csvOutput.write("officeID");
				csvOutput.endRecord();

				// else assume that the file already has the correct header line
				// write out a few records
				for(User u: users){
					csvOutput.write(u.getFirstName());
					csvOutput.write(u.getLastName());
					csvOutput.write(String.valueOf(u.getId()));
					csvOutput.write(u.getEmail());
					csvOutput.write(u.getPassword());
					csvOutput.write(String.valueOf(u.getLoginStatus()));
					csvOutput.write(String.valueOf(u.getOfficeID()));
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

}
