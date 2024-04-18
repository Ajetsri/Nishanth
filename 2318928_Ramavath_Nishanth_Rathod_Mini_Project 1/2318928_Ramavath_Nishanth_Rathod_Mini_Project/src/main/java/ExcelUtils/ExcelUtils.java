package ExcelUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelUtils {
	public String getExcelDestination(int r,int c) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\target\\DestinationDetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row1=sheet.getRow(r);
		XSSFCell cell1=row1.getCell(c);
		String value=cell1.toString();
		workbook.close();
		file.close();
		return value;
	}
	
	public void outputExcelData(List<WebElement> price,int size) throws IOException, InterruptedException {
		Thread.sleep(3000);
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\target\\OutputDetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		for(int r=0;r<price.size();r++)
		{
			XSSFRow currentrow=sheet.createRow(r);			
				String value=price.get(r).getText();
				System.out.println(value);
				currentrow.createCell(0).setCellValue(value);
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Writing is done!!!!");
	}
}
