package MS_Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class s1 {
	
	/*
	 
	 Day-32
--------
Data Driven testing
--------------
Excel

Apache poi - API used for automating ms documents- excel.

reading data from excel
writing data into excel


https://mvnrepository.com/artifact/org.apache.poi/poi/5.2.3
https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.3


Excel File-->Workbook-->Sheets---->Rows--->Cells

FileInputStream
FileOutputStream

XSSFWorkbook
XSSFSheet
XSSFRow
XSSFCell
	 
	 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Excel File-->Workbook-->Sheets---->Rows--->Cells
		
		
		//ReadingExcel
		
		/*
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\target\\Prac_ex.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  //workbook.getSheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of rows:"+totalrows); //5
		System.out.println("Number of cells:"+totalcells);  //4
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
					
			for(int c=0;c<totalcells;c++)
			{
				//XSSFCell cell=currentRow.getCell(c);
				//String value=cell.toString();
				String value=currentRow.getCell(c).toString();
				System.out.print(value+"      ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		*/
		
		//WritingDataIntoExcel
		
		 
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx"); 
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		
		//Creating rows, cells and update data without loop
		/*XSSFRow row1=sheet.createRow(0);
				
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("12345");
		row1.createCell(2).setCellValue("xyz");
				
		XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("abc");
		row2.createCell(1).setCellValue("4567");
		row2.createCell(2).setCellValue("testing");
		*/
		
		
		//creating rows, cells and update data using loop
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
						
			for(int c=0;c<2;c++)
			{
				//currentrow.createCell(c).setCellValue("welcome");
				
				System.out.println("Enter a value:");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
				
			}
		}
		
			
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done!!!!");
		 
		 
		 
		

	}

}
