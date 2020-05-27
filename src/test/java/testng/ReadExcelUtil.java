package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtil {

	public static Workbook book;
	public static Sheet mySheet;

	public static String TEST_DATA_PATH = "C:\\Users\\User\\eclipse-workspace\\SeleniumArtifact1\\testData\\TestData.xlsx";

	public static Object[][] getData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null;

		try {
			file = new FileInputStream(TEST_DATA_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);//reading the whole excel sheet
		} catch (IOException e) {
			e.printStackTrace();
		}

		mySheet = book.getSheet(sheetName);
		Object[][] data = new Object[mySheet.getLastRowNum()][mySheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < mySheet.getLastRowNum(); i++) {
			for (int j = 0; j < mySheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = mySheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}

}
