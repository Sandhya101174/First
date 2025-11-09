package com.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*; // Import common interfaces
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public List<String> getFromExcel(String tcId) {
		
		List<String> rowValues = new ArrayList<String>();
	    String excelFilePath = "C:\\Users\\USER\\Downloads\\TestData.xlsx"; // Or .xls
	    try {
			FileInputStream fis = new FileInputStream(excelFilePath);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			
			for (Row row : sheet) {
		        for (Cell cell : row) {
		        	if(cell.getStringCellValue().equals(tcId))
		        		for (Cell cellValues : row)
//		        			System.out.print(cellValues.getStringCellValue() + "\t");
		        			rowValues.add(cellValues.getStringCellValue());
		        			break;

		        }
		        System.out.println(); // New line for each row
		    }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowValues;
	}
	
	
//	public static void main(String[] args) {
//		ExcelReader er = new ExcelReader();
//		List l = er.getFromExcel("TC_01");
//		for(Object a : l) {
//			System.out.println(a);
//		}
//		
//	}
	
}
