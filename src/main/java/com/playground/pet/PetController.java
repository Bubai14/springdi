/**
 * 
 */
package com.playground.pet;

import org.springframework.stereotype.Controller;

/**
 * @author bubaibal
 *
 */
@Controller
public class PetController {

	private final PetService petService;

	/**
	 * @param petService
	 */
	public PetController(PetService petService) {
		this.petService = petService;
	}
	
	public String whichPetTypeisBest() {
		return petService.getPetType();
	}
}
