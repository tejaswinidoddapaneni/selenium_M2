package groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
@Test(groups="smoke")
public void demo1() {
	Reporter.log("test1-demo1-smoke",true);
}
@Test(groups="sanity")
public void demo2() {
	Reporter.log("test1-demo2-sanity",true);
}
@Test(groups= {"sanity","smoke"})
public void demo3() {
	Reporter.log("test1-demo3-smoke and sanity",true);
}
}
