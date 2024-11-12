package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocatorpractice3 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.className("Pke_EE")).sendKeys("iphone 16 pro max");
driver.findElement(By.className("_2iLD__")).click();
List<WebElement> iphoneList= driver.findElements(By.className("KzDlHZ"));
for(WebElement iphone : iphoneList) {
	System.out.println(iphone.getText());
}

Thread.sleep(3000);
driver.quit();
}
}