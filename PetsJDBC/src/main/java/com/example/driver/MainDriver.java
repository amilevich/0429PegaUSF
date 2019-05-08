package com.example.driver;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class MainDriver {

	public static void main(String[] args) {
		
		//populate some data
		Pet petOne = new Pet("Peeve", "Seahorse");
		Pet petTwo = new Pet("Lucky Oscar", "Golden Retriever");
		Pet petThree = new Pet("Bruno Mars", "Parrot");
		Pet petFour = new Pet("Hector", "Whale");
		
		//to access the methods to persist data, we first
		// must create an object of type PetDaoImpl
		PetDaoImpl pdImpl = new PetDaoImpl();
//		pdImpl.insertPet(petOne);
//		pdImpl.insertPet(petTwo);
//		pdImpl.insertPet(petThree);
//		pdImpl.insertPet(petFour);
		
		petFour.setType("Salamander");
		pdImpl.updatePet(petFour);
		pdImpl.deletePet(petTwo);
		System.out.println(pdImpl.selectAllPets());

	}

}
