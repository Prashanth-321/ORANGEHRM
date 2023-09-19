package Testcases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo {
	
	
	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Emp info");
		
		Object empdata[][]= { {"empid","name","job"},
							{101,"asdf","QA"},
							{102,"asdfjh","scrum"},
							{103,"asdfgh","lead"}
				
				
		};
		
		int rows = empdata.length;
		int column = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(column);
		
		for (int r = 0; r < rows; r++) //represents row
		
		{
			
			XSSFRow row = sheet.createRow(r);
			
			for (int c = 0; c < column; c++)// represents columns
			{
			XSSFCell cell = row.createCell(c); 
			Object value = empdata[r][c];
			
			if(value instanceof String) // instance of is a new operator
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
			
			
			
			}
		}
		
		String path = ".\\src\\empdata.xlsx"; //  .\\ represents current project directory and location
		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);
		
		fo.close();
		System.out.println("file written succeffully");
		
		
	}

}
