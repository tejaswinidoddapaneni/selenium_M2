package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributestextpractice2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	driver.findElement(By.xpath("//img[@alt='restaurants curated for biryani']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Pure veg']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Less than 30 mins']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Sai Kailash Dhaba']")).click();
	Thread.sleep(3000);
	
}
}
