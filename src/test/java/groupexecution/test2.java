package groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
@Test(groups="smoke")
public void demo1() {
	Reporter.log("test2-demo1-smoke",true);
}
@Test(groups="regression")
public void demo2() {
	Reporter.log("test1-demo2-regression",true);
}
@Test(groups= {"regression","smoke"})
public void demo3() {
	Reporter.log("test1-demo3-smoke and regression",true);
}
}
