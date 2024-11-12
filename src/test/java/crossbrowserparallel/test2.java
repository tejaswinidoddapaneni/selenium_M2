package crossbrowserparallel;

import org.testng.annotations.Test;

public class test2 extends baseclass {

	@Test
	public void swiggytest() {
		driver.get("https://www.swiggy.com/");
	}
}
