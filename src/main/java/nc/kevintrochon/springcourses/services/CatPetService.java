package nc.kevintrochon.springcourses.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Cat")
@Service
public class CatPetService implements PetService{

	@Override
	public String getPetType() {
		return "Cats Are the Best!";
	}

	

}
