/**
 * 
 */
package com.alvaroscheid.programming_test.Map;

import java.time.LocalDate;

/**
 * @author alvaro-scheid
 *
 */
public class Tile {

	private Modifier modifier;
	private boolean explored = false;
	private LocalDate lastTimeExecuted;

	/**
	 * @return the modifier
	 */
	public Modifier getModifier() {
		return modifier;
	}

	/**
	 * @param modifier the modifier to set
	 */
	public void setModifier(Modifier modifier) {
		this.modifier = modifier;
	}

	/**
	 * @return the explored
	 */
	public boolean isExplored() {
		return explored;
	}

	/**
	 * @param explored the explored to set
	 */
	public void setExplored(boolean explored) {
		this.explored = explored;
	}

	/**
	 * @return the lastTimeExecuted
	 */
	public LocalDate getLastTimeExecuted() {
		return lastTimeExecuted;
	}

	/**
	 * @param lastTimeExecuted the lastTimeExecuted to set
	 */
	public void setLastTimeExecuted(LocalDate lastTimeExecuted) {
		this.lastTimeExecuted = lastTimeExecuted;
	}


}
