package com.qa.task2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.qa.task1.Constants;
import com.qa.task1.LandingPage;

@RunWith(Parameterized.class)
public class ParamatizedExcel {

	@Parameters
	public static boolean data() throws IOException {

		FileInputStream file = new FileInputStream(Constants.excelTestPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int row = 1; row < sheet.getPhysicalNumberOfRows(); row++) {

			for (int column = 0; column < sheet.getRow(row).getPhysicalNumberOfCells(); column++) {

				XSSFCell cell = sheet.getRow(row).getCell(column);
				// changes depending on selected column, to assign each value to an input field
				switch (column) {
				case 0: {
					LandingPage.addUserName(cell.getStringCellValue());
					break;
				}
				case 1: {
					LandingPage.addFullName(cell.getStringCellValue());
					break;
				}
				case 2:
				case 3: {
					LandingPage.addPassword(cell.getStringCellValue());
					break;
				}
				case 4: {
					LandingPage.addEmail(cell.getStringCellValue());
					break;
				}
				}
			}
			LandingPage.submituser();
			LandingPage.clickUser();
		}
		file.close();
		return true;
	}
}
