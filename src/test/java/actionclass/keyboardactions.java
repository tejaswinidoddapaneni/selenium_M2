package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement searchTF = driver.findElement(By.name("q"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.SHIFT).sendKeys(searchTF,"hai").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='pkt1Wd byDyWd N8ZFrc']")).click();
	driver.quit();
}
}
