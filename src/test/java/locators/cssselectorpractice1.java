package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorpractice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input#email")).sendKeys("edsjhdjgydgeyu@gmail.com");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("adcdgdghgfehdsbh654");
	driver.findElement(By.cssSelector("button.selected")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
