package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors;

public class XLUtils {
	
	public static FileInputStream fi;
	public static Workbook wb;
	public static Sheet ws;
	public static  Row row;
	public static Cell cell;
	public static FileOutputStream fo;
	public static CellStyle style;
	
	public static int  getRowCount(String xlfile, String xlsheet) throws IOException 
	
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount  = ws.getLastRowNum();
		wb.close();
		return rowcount;
		
	}
	
	public static short getColCount(String xlfile,String xlsheet,int rownum) throws IOException 
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row =  ws.getRow(rownum);
		short colcount = row.getLastCellNum();
		wb.close();
		return colcount;
		
	}
	
	public static String getstringcelldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException 
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row =  ws.getRow(rownum);
		
		String data;
		try {
			cell = row.getCell(colnum);
			 data = cell.getStringCellValue();
			
			
		} catch (Exception e) 
		{
			data ="";
		}
		
		wb.close();
		return data;
		
		
		
	}
public static double getnumericcelldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException 
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row =  ws.getRow(rownum);
		
		double data;
		try {
			cell = row.getCell(colnum);
			 data = cell.getNumericCellValue();
			
			
		} catch (Exception e) 
		{
			data =0.0;
		}
		
		wb.close();
		return data;
		
		
		
	}

public static boolean getbooleanldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException 

{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row =  ws.getRow(rownum);
	
	boolean data;
	try {
		cell = row.getCell(colnum);
		 data = cell.getBooleanCellValue();
		
		
	} catch (Exception e) 
	{
		data = false;
	}
	
	wb.close();
	return data;
	
	}

public static void setCelldata(String xlfile,String xlsheet,int rownum,int colnum, String data) throws IOException 

{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row =  ws.getRow(rownum);
	cell = row.createCell(colnum);
	cell.setCellValue(data);
	fo = new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	
	
}	
	public static void fillGreencolor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException 
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row =  ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		
	}
	
      public static void fillRedcolor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException 
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row =  ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		
	}
}
