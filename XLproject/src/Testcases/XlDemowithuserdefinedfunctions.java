package Testcases;

import java.io.IOException;

import Utils.XLUtils;

public class XlDemowithuserdefinedfunctions {

	public static void main(String[] args) throws IOException 
	{
		
		 int x1 = XLUtils.getRowCount("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data");
		 System.out.println(x1);
		 
		 int x2 = XLUtils.getColCount("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 0);
		 System.out.println(x2);
		 
		 
		String data1 =  XLUtils.getstringcelldata("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 3, 1);
		System.out.println(data1);
		
		double data2 = XLUtils.getnumericcelldata("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 3, 1);
		System.out.println(data2); 
		
		boolean res = XLUtils.getbooleanldata("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 3, 3);
		System.out.println(res);
		
		XLUtils.setCelldata("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 2, 4, "hello");
		XLUtils.setCelldata("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 3, 4, "howww");

		
		XLUtils.fillGreencolor("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 2, 4);
		XLUtils.fillRedcolor("C:\\Users\\INDIA\\Documents\\demo.xlsx", "Emp data", 3, 4);
		 
	}
}
