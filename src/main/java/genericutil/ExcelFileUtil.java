package genericutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil {
	public String  readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
	    FileInputStream fise = new FileInputStream(IconstantUtil.xLpath);
	  Workbook wb  =  WorkbookFactory.create(fise);
 return  wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
 }
}
