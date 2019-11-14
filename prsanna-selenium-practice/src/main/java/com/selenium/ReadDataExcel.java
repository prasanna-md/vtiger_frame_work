package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		int count=-1;
		Workbook wb=WorkbookFactory.create(new FileInputStream("C:\\Users\\Pinki\\Desktop\\Defect Template.xlsx"));
		int column=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(column);
		Row row=wb.getSheet("Sheet1").getRow(0);
		for(int i=0;i<row.getPhysicalNumberOfCells();i++) {
			Cell cell=row.getCell(i);
			if(cell.toString().equalsIgnoreCase("un")) {
				count=i;
				System.out.println(count);
			}
		}
		System.out.println(count);
		int j=wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(j);
		int c=1;
		for(int i=0;i<column;i++) {
			if(wb.getSheet("Sheet1").getRow(0).getCell(i).toString().equalsIgnoreCase("un")) {
				while(c<=j) {
					System.out.println(wb.getSheet("Sheet1").getRow(c).getCell(count));
					c++;
				}
			}
		}
	}

}
