package datadriverntesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class wrtiteToExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/textdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	sheet.createRow(5).createCell(0).setCellValue("subjet");
	sheet.getRow(5).createCell(1).setCellValue("selenium");
	FileOutputStream fos = new FileOutputStream("./src/test/resources/textdata.xlsx");
	wb.write(fos);
	wb.close();
}
}
