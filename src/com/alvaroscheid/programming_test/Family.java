/**
 * 
 */
package com.alvaroscheid.programming_test;

/**
 * @author alvaro-scheid
 *
 *         Class that holds the reference to the family relationship.
 */
public class Family {

	private NPC brother;
	private NPC sister;
	private NPC mother;
	private NPC father;
	private NPC son;
	private NPC daughter;

	/**
	 * @return the brother
	 */
	public NPC getBrother() {
		return brother;
	}

	/**
	 * @param brother the brother to set
	 */
	public void setBrother(NPC brother) {
		this.brother = brother;
	}

	/**
	 * @return the sister
	 */
	public NPC getSister() {
		return sister;
	}

	/**
	 * @param sister the sister to set
	 */
	public void setSister(NPC sister) {
		this.sister = sister;
	}

	/**
	 * @return the mother
	 */
	public NPC getMother() {
		return mother;
	}

	/**
	 * @param mother the mother to set
	 */
	public void setMother(NPC mother) {
		this.mother = mother;
	}

	/**
	 * @return the father
	 */
	public NPC getFather() {
		return father;
	}

	/**
	 * @param father the father to set
	 */
	public void setFather(NPC father) {
		this.father = father;
	}

	/**
	 * @return the son
	 */
	public NPC getSon() {
		return son;
	}

	/**
	 * @param son the son to set
	 */
	public void setSon(NPC son) {
		this.son = son;
	}

	/**
	 * @return the daughter
	 */
	public NPC getDaughter() {
		return daughter;
	}

	/**
	 * @param daughter the daughter to set
	 */
	public void setDaughter(NPC daughter) {
		this.daughter = daughter;
	}

}
