package datadriverntesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// Step-1: convert physical file into java readable object
	FileInputStream fis = new FileInputStream("./src/test/resources/textdata.xlsx");
	 
	//step-2: open workbook
   Workbook wb = WorkbookFactory.create(fis);
   
   //step-3:get control over a particular sheet
  Sheet sheet =  wb.getSheet("Sheet1");
  
  //step-4:get control over a particular row
  Row row = sheet.getRow(3);
  
  //step-5:get control over a particular cell
  Cell cell = row.getCell(1);
  
  //step-6:fetch data
  String data = cell.getStringCellValue();
  System.out.println(data);
  
  //step-7:close workbook
  wb.close();
  
   
}
}
