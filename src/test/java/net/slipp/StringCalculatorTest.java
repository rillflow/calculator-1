package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator dut;
	
	@Before
	public void setup() {
		dut = new StringCalculator();
	}
	
	@Test
	public void addTwoNumberWithCommaSeparator() throws Exception {
		int actual = dut.add("1,2");
	}
}
