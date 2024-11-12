package alertpopups;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert a =driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("selenium");
		a.accept();
		driver.quit();
	}
}
