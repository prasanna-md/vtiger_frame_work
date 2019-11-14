 package com.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
       FileInputStream fis= new FileInputStream("excel file path");
       Workbook w=WorkbookFactory.create(fis);
       Sheet sh= w.getSheet("Sheet1");
       Row firstRow=sh.getRow(0);
       int rowcount= sh.getPhysicalNumberOfRows();
       for(int i=0;i<rowcount;i++) {
    	   for(int j=0;j<firstRow.getLastCellNum();j++) {
    		   Cell c1 = sh.getRow(i).getCell(j);
    		   System.out.println(c1+"     ");
    	   }
        System.out.println();
       }
       System.out.println("*************");
       sh.getRow(0).getLastCellNum();
       System.out.println(sh.getRow(1).getCell(0).toString());
       System.out.println(System.getProperty("user.dir"));
       
	}

}
