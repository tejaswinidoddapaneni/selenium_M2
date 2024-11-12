package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {

	@Test(invocationCount=2)
	public void demo7() {
		Reporter.log("demo7",true);
	}
	
	@Test(invocationCount=1)
	public void demo1() {
		Reporter.log("demo1",true);
	}
	
	@Test(invocationCount=6)
	public void demo3() {
		Reporter.log("demo3",true);
	}
	
	@Test(invocationCount=5)
	public void demo4() {
		Reporter.log("demo4",true);
	}
	@Test
	public void demo6() {
		Reporter.log("demo6",true);
	}
	
	
	
}
