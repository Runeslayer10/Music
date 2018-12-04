/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package music;

/**
 * Clarinet class.
 */
public class Clarinet extends Woodwind {
		
	/**
	 * constructor
	 * pre: none
	 * post: An clarinet has been created.
	 */
	public Clarinet(String clarinetist) {
		super(clarinetist);
	}


	/** 
	 * Returns the sound of the instrument.
	 * pre: none
	 * post: The sound made by the instrument is returned.
	 */
	public String makeSound() {
	 	return("squawk");
	}

	
	/** 
	 * Returns a String that represents the instrument.
	 * pre: none
	 * post: A string representing the instrument has 
	 * been returned.
	 */
	public String toString() {
	 	return(super.getMusician() + " plays " + makeSound() + ".");
	}
}
