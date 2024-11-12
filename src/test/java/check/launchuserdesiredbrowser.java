package check;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class launchuserdesiredbrowser {
public static  void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter browser name");
	String browser = scan.next();
	WebDriver driver=null;
	if(browser.equalsIgnoreCase("chrome"))
	driver=new ChromeDriver();
	else if(browser.equalsIgnoreCase("firefox"))
		driver = new FirefoxDriver();
	else if(browser.equalsIgnoreCase("edge"))
		driver = new EdgeDriver();
	else
		System.out.println("invalid browser name");
	
	
}
}
