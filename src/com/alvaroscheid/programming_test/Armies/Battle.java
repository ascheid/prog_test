/**
 * 
 */
package com.alvaroscheid.programming_test.Armies;

/**
 * @author alvaro-scheid
 *
 */
public class Battle {

	private Army attack;
	private Army defense;

	public Battle(Army attack, Army defense) {
		this.attack = attack;
		this.defense = defense;
	}

	public void executeBattle() {
		int countAttack = attack.getArchers().size() + attack.getCavalry().size() + attack.getWarriors().size();
		int countDef = defense.getArchers().size() + defense.getCavalry().size() + defense.getWarriors().size();

		while (countAttack != 0 || countDef != 0) {

		}
	}
}
