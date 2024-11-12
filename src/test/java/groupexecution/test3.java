package groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 {
@Test(groups="regression")
public void demo1() {
	Reporter.log("test1-demo1-regression",true);
}
@Test(groups="sanity")
public void demo2() {
	Reporter.log("test1-demo2-sanity",true);
}
@Test(groups= {"sanity","regression"})
public void demo3() {
	Reporter.log("test1-demo3-regression and sanity",true);
}
}
