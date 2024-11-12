package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	//declaration
	@FindBy(name="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(css="[type='checkbox']")
	private WebElement keeploggedincheckbox;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPWDlink;
	
	@FindBy(className="login_Btn")
	private WebElement loginBTN;
	
	//Initialization
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setemail(String email) {
		emailTF.sendKeys(email);
	}
   public void setpassword(String pwd) {
	   passwordTF.sendKeys(pwd);
	   }
   public void clickkeeploggedin() {
	   keeploggedincheckbox.click();
   }
   public void clickforgotpwd() {
	   forgotPWDlink.click();
   }
   public void clicklogin() {
   loginBTN.click();
   }
   
   
   
   }