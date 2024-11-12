package datadriverntesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfromexcelmethodchaining {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/textdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Double data = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(data);
	wb.close();
}
}
