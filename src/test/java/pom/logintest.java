package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	loginpage login = new loginpage(driver);
	login.setemail("admin");
	login.setpassword("admin");
	login.clickkeeploggedin();
	login.clicklogin();
	Thread.sleep(2000);
	driver.quit();
}
}
