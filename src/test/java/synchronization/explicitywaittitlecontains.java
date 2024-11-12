package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitywaittitlecontains {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	boolean status = wait.until(ExpectedConditions.titleContains("shoppersStack"));
	System.out.println(status);
	driver.quit();
}
}
