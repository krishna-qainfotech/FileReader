import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

public class ReadProperty {
public static void main(String ... krishna) {
    String FilePath = System.getProperty("user.dir");
	String FileName = "Krishna.properties";
	File file = new File(FilePath+"///"+FileName);
	if(file.exists()) {
        System.out.println("File already exist");			
	}
	else {
		System.out.println("Create a new File.");
	}
	Properties prop = new Properties();
	try {
    
		prop.load(new FileInputStream("/home/qainfotech/eclipse-workspace/ReadFile/Krishna.properties"));
        StringWriter writer = new StringWriter();
        prop.list(new PrintWriter(writer));
        System.out.println(writer.getBuffer().toString());

	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
