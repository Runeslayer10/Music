/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package music;

/**
 * Instrument class.
 */
abstract class Instrument {
	String musician;

	/**
	 * constructor
	 * pre: none
	 * post: A musician has been assigned to the instrument.
	 */
	public Instrument(String name) {
		musician = name;
	}
	
	
	/** 
	 * Returns the name of the musician
	 * pre: none
	 * post: The name of the musician playing the instrument
	 * has been returned.
	 */
	public String getMusician() {
		return(musician);
	}

		
	/** 
	 * Should return the sound of the instrument.
	 * pre: none
	 * post: The sound made by the instrument is returned.
	 */
	abstract String makeSound();
}
