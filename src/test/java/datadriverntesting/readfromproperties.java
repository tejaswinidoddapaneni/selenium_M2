package datadriverntesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readfromproperties {
public static void main(String[] args) throws IOException {
	//step-1:convert physical file into java readable object
	FileInputStream fis = new FileInputStream("./src/test/resources/Data.properties");
	
	//step-2:create an instance of properties class
	Properties property=new Properties();
	
	//step-3:load all key-value pairs from fis to property
	property.load(fis);
	
	//step-4:read data from properties
	String browser = property.getProperty("browser");
	System.out.println(browser);
	
	String time = property.getProperty("time");
	System.out.println(time);
}
}
