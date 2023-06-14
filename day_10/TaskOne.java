package com.example.ice2.day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskOne {
	public static void main(String[] arg) throws IOException
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
		fis.close();
		workbook.close();
	}
}
