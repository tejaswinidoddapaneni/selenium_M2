package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getgettitlegetcurrenturl {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.netflix.com/in/");
String url =driver.getCurrentUrl();
String title=driver.getTitle();
System.out.println(title+ "\n"+url);
}

}