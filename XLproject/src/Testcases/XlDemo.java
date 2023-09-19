package Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("c:\\users\\iNDIA\\documents\\demo.xlsx");
		
		Workbook wb = new XSSFWorkbook(fi);
		
		/*wb.createSheet("Demo sheet");
		
		FileOutputStream fo = new FileOutputStream("c:\\users\\iNDIA\\documents\\result.xlsx");
		wb.write(fo);
		wb.close();*/
		
		Sheet ws1 = wb.getSheet("Emp data");
		
		int rowcount = ws1.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			
		/*Sheet ws2 = wb.getSheet("Emp data");
		
		int sheet1_rowcount = ws1.getLastRowNum();
		int sheet2_rowcount = ws2.getLastRowNum();
		
		
		System.out.println(sheet1_rowcount);
		System.out.println(sheet2_rowcount);
		
		wb.close();
		
		Row row1 = ws1.getRow(0);
		Row row2 = ws1.getRow(1);
		
		Short row1_col_count = row1.getLastCellNum();
		Short row2_col_count = row2.getLastCellNum();
		
		System.out.println(row1_col_count);
		System.out.println(row2_col_count);
		
		wb.close();*/
		
		Row r = ws1.getRow(i);
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		Cell c3 = r.getCell(2);
		Cell c4 = r.getCell(3); 
		
		String empno = c1.getStringCellValue();
		String empname = c2.getStringCellValue();
		double sal = c3.getNumericCellValue();
		boolean result = c4.getBooleanCellValue();
		
		System.out.println(empno+"  "+empname+" "+sal+"   "+result );
		}
		wb.close();
	}

}
