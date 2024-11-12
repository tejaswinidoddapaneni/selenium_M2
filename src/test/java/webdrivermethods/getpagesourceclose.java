package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getpagesourceclose {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.netflix.com/in/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
	}

}
