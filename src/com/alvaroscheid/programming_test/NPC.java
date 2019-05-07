/**
 * 
 */
package com.alvaroscheid.programming_test;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;

/**
 * @author alvaro-scheid Class that specify the non-player character. Color is
 *         specified by the class awt where is used RGB color style.
 */
public class NPC {

	private String name;
	private LocalDate birth;
	private Color hairColor;
	private Job job;
	private Family family;

	/**
	 * @return the Java 8 Period. To retrieve years, getYears over the return.
	 */
	public Period getAge(LocalDate date) {
		return Period.between(birth, date);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birth
	 */
	public LocalDate getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	/**
	 * @return the hairColor
	 */
	public Color getHairColor() {
		return hairColor;
	}

	/**
	 * @param hairColor the hairColor to set
	 */
	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
	}

	/**
	 * @return the job
	 */
	public Job getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(Job job) {
		this.job = job;
	}

	/**
	 * @return the family
	 */
	public Family getFamily() {
		return family;
	}

	/**
	 * @param family the family to set
	 */
	public void setFamily(Family family) {
		this.family = family;
	}

}
