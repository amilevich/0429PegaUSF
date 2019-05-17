package com.example.dao;

import java.util.List;

import com.example.model.Expanses;


public interface ExpDao {
	
	// CREATE 
	public int submitExp(Expanses x);
	
	// READ 
	public Expanses selectPetByName(String name);
	public List<Expanses> selectAllPets();
	
	// UPDATE
	public int updatePet(Expanses x);
	
	//DELETE
	public int deletePet(Expanses x);
}


