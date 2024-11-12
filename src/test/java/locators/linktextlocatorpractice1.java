package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextlocatorpractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
         driver.findElement(By.linkText("Forgotten password?")).click();
         driver.findElement(By.id("identify_email")).sendKeys("ejhdjhggsegfuyergu");
         driver.findElement(By.name("did_submit")).click();
         Thread.sleep(3000);
         driver.quit();
         
	}

}
