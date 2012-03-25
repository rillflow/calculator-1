package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
	private static final Logger logger = LoggerFactory.getLogger(CalculatorTest.class);
	
	@Test
	public void plus() throws Exception {
		Calculator dut = new Calculator();
		int actual = dut.plus(1,2);
		logger.debug("result : {}", actual);
		assertThat(actual, is(3));
	}
	
	@Test
	public void minus() throws Exception {
		
	}
}
