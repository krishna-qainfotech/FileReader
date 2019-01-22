import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class WriteProperty {
	public static void main(String[] args) {
		
		String FilePath = System.getProperty("user.dir");
		String FileName = "Krishna.properties";
		Scanner sc = new Scanner(System.in);
		try {
		File file= new File(FilePath+"///"+FileName);
		if(file.exists()) {
            System.out.println("File already exist");			
		}
		else {
			file.createNewFile();
			System.out.println("New File is create at this location : "+FilePath+"///"+FileName);
		}
		if(file.canWrite()) {
			System.out.println("File can write : ");
			Properties prop = new Properties();
			FileOutputStream fr = new FileOutputStream(file);
			prop.store(fr, "Krishna:Chauhan");
			prop.setProperty("newkey1", "newvalue");
			prop.setProperty("newkey2", "newvalue");
			prop.setProperty("newkey3", "newvalue");
			prop.setProperty("newkey4", "newvalue");
			prop.setProperty("newkey5", "newvalue");
			prop.setProperty("newkey6", "newvalue");
			prop.setProperty("newkey7", "newvalue");
			
			prop.store(fr, "Properties");
		        
			fr.close();
		}
}catch(Exception e) {
	
}
	}
}