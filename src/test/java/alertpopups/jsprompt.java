package alertpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsprompt {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("selenium");
		a.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
}

}