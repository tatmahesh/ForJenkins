package com.uma.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalc mycalc = new JenkinsCalc();
		assertEquals(10, mycalc.add(5, 5));
	}

	public void subTest() {
		JenkinsCalc mycalc = new JenkinsCalc();
		assertEquals(5, mycalc.sub(10, 5));
	}

}
