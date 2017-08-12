package com.hfbank.factory.simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitGardenerTest {

	@Test
	public void testFactory() {
		try {
			Fruit apple = FruitGardener.factory("Apple");
			assertTrue(apple instanceof Apple);
		} catch (BadFruitException e) {
			fail("exception happened.");
		}

		try {
			FruitGardener.factory("NotKnowFruit");
			fail("should fail with exception!");
		} catch (BadFruitException e) {
			assertTrue(true);
		}
	}

}
