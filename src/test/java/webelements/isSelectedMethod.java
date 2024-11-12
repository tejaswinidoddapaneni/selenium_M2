package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.linkText("Create new account")).click();
	    WebElement femaleRadioBTN=driver.findElement(By.xpath("//input[@value='1']"));
	    femaleRadioBTN.click();
	    Thread.sleep(2000);
	    if(femaleRadioBTN.isSelected())
	    	System.out.println("selected");
	    	else
	    		System.out.println("not selected");
	    driver.quit();
	}
}
