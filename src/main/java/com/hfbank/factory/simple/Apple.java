package com.hfbank.factory.simple;

/**
 * 具体产品类
 * 
 * @author ningjiangbin
 *
 */
public class Apple implements Fruit {

	private int treeAge;

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	public void grow() {
		System.out.println("Apple growing...");
	}

	public void harvest() {
		System.out.println("Apple has been harvested.");
	}

	public void plant() {
		System.out.println("Apple has been planted.");
	}
}
