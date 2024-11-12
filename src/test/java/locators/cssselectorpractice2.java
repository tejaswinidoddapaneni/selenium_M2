package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cssselectorpractice2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("djhuiwehgbdbj@gmail.com");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwre123");
	driver.findElement(By.cssSelector("button[type=\'submit\'] ")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
