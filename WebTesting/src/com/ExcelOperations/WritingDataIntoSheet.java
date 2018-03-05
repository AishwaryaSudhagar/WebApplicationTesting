package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoSheet {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(5);
		Cell c=r.createCell(3);
		
		c.setCellValue("Aishwarya");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		workBook.write(file1);
	}

}
