import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class StringCalculator {
	
	public void testcal()
	{
	     Calculator calculator = new Calculator();
	     assertEquals(calculator.calculator(""),0);
	}
	
	public void num()
	{
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculator("1"),1);
		
	}
	public void numers() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculator("1,2"),3);
	
	}
	
	public void sum()
	{
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculator("1,2,3"),6);
	}
	
	
	@Test
	public void negative()
	{
		Calculator calculator = new Calculator();
		calculator.calculator("-1");
	}
	

}
