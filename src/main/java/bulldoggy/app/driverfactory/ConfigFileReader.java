package bulldoggy.app.driverfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties prop;
	
	public Properties getProp() {
		prop = new Properties();
		try {
			FileInputStream inputFile = new FileInputStream("./src/test/resources/appConfig/config.properties");
			prop.load(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
}
