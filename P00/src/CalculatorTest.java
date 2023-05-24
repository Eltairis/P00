import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
		
	}
	@Test
	public final void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	@Test
	public final void testSubtract() {
			int a = 5;
			int b = 1;
				
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b); 
				 
			int expected = 4;
			assertEquals (expected, actual);
			}
	@Test
	public void testMultiply() {
		int a = 2;
		int b = 3;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 6;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivide() {
		int a = 4;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 2;
		assertEquals (expected, actual);
		}



	}

