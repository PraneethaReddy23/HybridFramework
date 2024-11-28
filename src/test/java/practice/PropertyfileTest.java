package practice;

import genericutil.PropertyFileUtil;

public class PropertyfileTest {
	public static void main(String[] args) throws Throwable {
		PropertyFileUtil p = new PropertyFileUtil();
		System.out.println(p.readDataFromPf("UN"));
		System.out.println(p.readDataFromPf("PWD"));
		System.out.println(p.readDataFromPf("Url"));
		System.out.println(p.readDataFromPf("browser"));
		
	}

}
