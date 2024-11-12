package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabledmethod {
public static void main(String[] args) throws InterruptedException   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement loginBTN=driver.findElement(By.cssSelector("button[type='submit']"))	;
	if(loginBTN.isEnabled())
		loginBTN.click();
	else
		System.out.println("disabled");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("hdfsjrfheu");
	driver.findElement(By.name("password")).sendKeys("ldfhuhuyhuityr");
	Thread.sleep(3000);
	if(loginBTN.isEnabled())
		loginBTN.click();
	else
		System.out.println("disabled");
	driver.quit();
}
}
