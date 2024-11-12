package crossbrowserparallel;

import org.testng.annotations.Test;

public class test1  extends baseclass{

	@Test
	public void googletest() {
		driver.get("https://www.google.co.in/");
	}
}
