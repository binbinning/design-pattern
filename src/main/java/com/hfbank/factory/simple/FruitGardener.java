package com.hfbank.factory.simple;

/**
 * the factory
 * 
 * @author ningjiangbin
 *
 */
public class FruitGardener {

	/**
	 * static factory method
	 * 
	 * @param which
	 *            - the fruit you want to get
	 * @return
	 * @throws BadFruitException
	 */
	public static Fruit factory(String which) throws BadFruitException {
		if (which.equals("Apple")) {
			return new Apple();
		} else {
			throw new BadFruitException("Bad Fruit request.");
		}
	}

}
