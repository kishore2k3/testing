package com.example.ice2.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static Object[][] readExcel() throws IOException
	{
		String location = "D:\\SKCT\\SEM 4\\TESTING\\day10.xlsx";
		FileInputStream fis = new FileInputStream(location);
		// creating a work book object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// locating the sheets
		XSSFSheet sheet = workbook.getSheetAt(0);
		// getting total rows
		int total = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows :"+ total);
		// to print the columns 
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("Total Columns: "+column);
		// geting rows using xssf
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		System.out.println("Cell value :"+ cell);
		Object[][] data = new Object[total-1][column];
		for(int i=1;i<total;i++)
		{
			row = sheet.getRow(i);
			for(int j=0;j<column;j++)
			{
				cell=row.getCell(j);
				data[i-1][j]=cell.getNumericCellValue();
				System.out.println(cell.getNumericCellValue());
			}
		}
		fis.close();
		workbook.close();
		return data;
	}
}
