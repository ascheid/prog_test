/**
 * 
 */
package com.alvaroscheid.programming_test.Armies;

/**
 * @author alvaro-scheid Enumeration that keeps the unit type and also its power
 *         that is going to be used as a bonus.
 */
public enum UnitType {

	WARRIOR(0, -1, 1), ARCHER(1, 0, -1), CAVALRY(-1, 1, 0);

	public int strAgainstWarrior;
	public int strAgainstArcher;
	public int strAgainstCavalry;

	UnitType(int a, int b, int c) {
		strAgainstWarrior = a;
		strAgainstArcher = b;
		strAgainstCavalry = c;
	}

}
