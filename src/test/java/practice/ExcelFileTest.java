package practice;

import genericutil.ExcelFileUtil;

public class ExcelFileTest {
	public static void main(String[] args) throws Throwable {
		ExcelFileUtil e = new ExcelFileUtil();
	System.out.println(e.readDataFromExcel("Sheet1", 0, 0));
	 System.out.println(e.readDataFromExcel("Sheet1", 0, 1));
	 System.out.println(e.readDataFromExcel("Sheet1", 0, 2));
	}

}
