package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampletest {

	@Test
	public void demo() {
		Reporter.log("hello world",true);
	}
}
