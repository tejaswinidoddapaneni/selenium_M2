package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertionTest {
@Test
public void demo() {
	String s1 = "hello";
	String s2 = "hi";
	
	Assert.assertEquals(s1, s2);
	System.out.println(s1);
	System.out.println(s2);
}
}
