/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package music;

/**
 * Woodwind class.
 */
abstract class Woodwind extends Instrument {
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A woodwind instrument has been created.
	 */
	public Woodwind(String player) {
		super(player);
	}


	/** 
	 * Returns the sound of the instrument.
	 * pre: none
	 * post: The sound made by the instrument is returned.
	 */
	public String makeSound() {
	 	return("toot");
	}
}
