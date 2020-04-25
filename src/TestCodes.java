import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCodes {

	AddTwoNums addTwoNum;
	Temperature temp;
	
	@Before
	public void setUp() throws Exception {
		addTwoNum = new AddTwoNums(6, 4);
		temp = new Temperature();
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(10, addTwoNum.add());
	}

	@Test
	public void testCold(){
		Assert.assertEquals("Cold", temp.weatherOutside(30));
	}
	
	
	@Test
	public void testWarm(){
		Assert.assertEquals("Warm", temp.weatherOutside(75));
	}
	
	@Test
	public void testHot(){
		Assert.assertEquals("Hot", temp.weatherOutside(200));
	}
}
