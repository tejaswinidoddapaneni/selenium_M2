package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependson {
@Test
public void regestrationtest() {
	Reporter.log("register to app",true);
}
@Test(dependsOnMethods="regestrationtest")
public void logintest() {
	Reporter.log("login to app",true);
}

@Test(dependsOnMethods="logintest")
public void updateprofiletest() {
	Reporter.log("update the profile",true);
}




}
