package genericutil;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public String readDataFromPf(String key) throws Throwable {
		FileInputStream fisp = new FileInputStream(IconstantUtil.propath);
				Properties p = new Properties();
				p.load(fisp);
		return	p.getProperty(key);
	}

}
