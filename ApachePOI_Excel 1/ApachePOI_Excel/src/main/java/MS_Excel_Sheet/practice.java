package MS_Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Excel File-->Workbook-->Sheets---->Rows--->Cells
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\target\\OutputDetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);			
			for(int c=0;c<2;c++)
			{
				//currentrow.createCell(c).setCellValue("welcome");
				System.out.println("Enter a value:");
				String value="I love You";
				currentrow.createCell(c).setCellValue(value);
			}
		}
		
			
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done!!!!");
		
		
	}
	
	
	

}
