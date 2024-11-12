package datadriverntesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginscriptusingexcel {
	public static void main(String[] args) throws InterruptedException  {
		Map<String,String> map = readData();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		long time = Long.parseLong(map.get("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("email")).sendKeys(map.get("username")+ Keys.TAB+map.get("password")+Keys.ENTER);
		
		Thread.sleep(2000);
         driver.quit();		
	}
	
		public static Map<String , String > readData(){
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./src/test/resources/textdata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		Map<String,String> map = new HashMap<String, String>();
		for(int i =0; i<=sheet.getLastRowNum();i++) {
			String Key = df.formatCellValue(sheet.getRow(i).getCell(0));
			String Value = df.formatCellValue(sheet.getRow(i).getCell(1));
			map.put(Key, Value);
		}
	  
	   try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return map;
}
}
