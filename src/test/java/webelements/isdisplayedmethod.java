package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayedmethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo = driver.findElement(By.cssSelector("svg#Layer_1"));
	if(logo.isDisplayed())
		System.out.println("displayed");
	else
		System.out.println("not displayed");
	driver.quit();
}
}
