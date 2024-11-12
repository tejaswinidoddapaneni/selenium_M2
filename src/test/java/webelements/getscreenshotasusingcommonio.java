package webelements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getscreenshotasusingcommonio {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement instaIMG = driver.findElement(By.cssSelector("div.xamitd3"));
		File temp = instaIMG.getScreenshotAs(OutputType.FILE);
        File dest = new File("./ElementScreenshots/insta.png");
        FileUtils.copyFile(temp, dest);
        driver.quit();
	}

}
