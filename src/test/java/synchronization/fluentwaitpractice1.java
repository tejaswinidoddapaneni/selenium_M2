package synchronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitpractice1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			               .withTimeout(Duration.ofSeconds(10))
			               .pollingEvery(Duration.ofSeconds(2))
			               .ignoring(Exception.class);
	WebElement header = wait.until(new Function<WebDriver , WebElement>(){

		@Override
		public WebElement apply(WebDriver t) {
		   WebElement e= t.findElement(By.xpath("//h4[text()='Hello World!']"));
		   if(e.isDisplayed())
			   return e;
		   else
			return null;
		}
		
	});
	System.out.println(header.getText());	
	driver.quit();
}
}
