package com.selenium;


	import java.io.FileInputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;


		public class ReadDataXcel {
		@DataProvider
		public static String[][] createUser() throws Exception {
			String[][] s;

			
			FileInputStream ff = new FileInputStream("C:\\Users\\Pinki\\Desktop\\Defect Template.xlsx");
			Workbook excel = WorkbookFactory.create(ff);

			Sheet sheet = excel.getSheet("Sheet1");
			s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
					Cell value = sheet.getRow(i).getCell(j);
					s[i - 1][j] = value.toString();
					Reporter.log(s[i - 1][j], true);
				}
			}

			return s;

		}

		@Test(dataProvider = "createUser")
		public void test(String username, String password) {
			Reporter.log(username, true);
			Reporter.log(password, true);

		}


}
