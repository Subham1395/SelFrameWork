package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property 
{
	public String getKeyValue(String key) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("test-output/comon_data.properties.txt");
		  Properties pro = new Properties();
		  pro.load(fis);
		  String value = pro.getProperty(key);
		return value;
	
	}	

}
