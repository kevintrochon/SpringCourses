package nc.kevintrochon.springcourses.controller;

import org.springframework.stereotype.Controller;

import nc.kevintrochon.springcourses.services.PetService;

@Controller
public class PetController {
	
	private final PetService petService;
	
	
    public PetController(PetService petService) {
		this.petService = petService;
	}

	public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
