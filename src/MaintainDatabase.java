import java.io.File;
import java.io.FileWriter;
import java.time.LocalTime;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainDatabase {
	public ArrayList<Database> databaseList = new ArrayList<Database>();
	public String path;
	public static int durationOrg;
	
	
	
	public boolean unique(int parking) {
		for (Database d : databaseList) {
			
			if (parking == d.getParkingLot()) {
				return true;
			}
		}
			return false;
				
	}
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()){ 
			Database database = new Database();
			
			database.setEmail(reader.get("email"));
			database.setParkingLot(Integer.valueOf(reader.get("parkinglot")));
			database.setLicense(reader.get("license"));
			database.setDuration(Integer.valueOf(reader.get("duration")));
			database.setPaid(Boolean.valueOf(reader.get("paid")));
			database.setbookID(Integer.valueOf(reader.get("bookid")));
			database.setValidated(Boolean.valueOf(reader.get("validated")));
			database.setTime(reader.get("time"));
			databaseList.add(database);
			
		}
	}
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				//name,id,email,password
				csvOutput.write("email");
				csvOutput.write("parkinglot");
				csvOutput.write("license");
				csvOutput.write("duration");
				csvOutput.write("paid");
				csvOutput.write("bookid");
				csvOutput.write("validated");
				csvOutput.write("time");
				csvOutput.endRecord();

				// else assume that the file already has the correct header line
				// write out a few records
				for(Database d: databaseList){
					csvOutput.write(d.getEmail());
					csvOutput.write(String.valueOf(d.getParkingLot()));
					csvOutput.write(d.getLicense());
					csvOutput.write(String.valueOf(d.getDuration()));
					csvOutput.write(String.valueOf(d.getPaid()));
					csvOutput.write(String.valueOf(d.getbookID()));
					csvOutput.write(String.valueOf(d.getValidated()));
					csvOutput.write(d.getTime());
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
}
