package com.is.automation.test;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class checkForInactive extends CustomLibarary{
  @Test
  public void checkForInactive_Test() throws IOException  
  {
	  
	   
	   FileInputStream fis = new FileInputStream("/home/amandeep/Downloads/kroll skus.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook(fis);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	                          //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
	                          //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	   Row row = sheet.getRow(0);
	   Cell cell = row.getCell(0);
	                         System.out.println(cell);
	   System.out.println(sheet.getRow(0).getCell(0));
	   //String cellval = cell.getStringCellValue();
	   //System.out.println(cellval);
	   }
}
