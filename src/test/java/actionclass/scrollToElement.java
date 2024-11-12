package actionclass;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollToElement {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement blockbusterdeals = driver.findElement(By.xpath("//span[text()='Blockbuster deals']/ancestor::div[@class='d-showcase-header-container']"));
		Actions action = new Actions (driver);
		action.scrollToElement(blockbusterdeals).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
