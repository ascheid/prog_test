/**
 * 
 */
package com.alvaroscheid.programming_test.Armies;

import java.util.List;

/**
 * @author alvaro-scheid
 *
 */
public class Army {

	private List<Unit> warriors;
	private List<Unit> archers;
	private List<Unit> cavalry;

	/**
	 * @return the warriors
	 */
	public List<Unit> getWarriors() {
		return warriors;
	}

	/**
	 * @param warriors the warriors to set
	 */
	public void setWarriors(List<Unit> warriors) {
		this.warriors = warriors;
	}

	/**
	 * @return the archers
	 */
	public List<Unit> getArchers() {
		return archers;
	}

	/**
	 * @param archers the archers to set
	 */
	public void setArchers(List<Unit> archers) {
		this.archers = archers;
	}

	/**
	 * @return the cavalry
	 */
	public List<Unit> getCavalry() {
		return cavalry;
	}

	/**
	 * @param cavalry the cavalry to set
	 */
	public void setCavalry(List<Unit> cavalry) {
		this.cavalry = cavalry;
	}

}
