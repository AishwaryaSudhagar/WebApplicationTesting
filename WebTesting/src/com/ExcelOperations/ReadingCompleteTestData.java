package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleteTestData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int k=0;k<=RowCount;k++)// ROW
		{
			Row r=sheet.getRow(k);
			int CellCount=r.getLastCellNum();
			for(int l=0;l<CellCount;l++) // Cell
			{
				Cell c=r.getCell(l);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
	

	}

}
