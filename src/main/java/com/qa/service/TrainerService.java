package com.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repo.TrainerRepo;

@Service
public class TrainerService {
	
	private TrainerRepo repo;
	
	public TrainerService(TrainerRepo repo) {
		this.repo = repo;
	}
	
	public List<Trainer> getAllTrainers() 
	{
		return repo.findAll();
	}
	
	public Trainer addNewTrainer(Trainer trainerToAdd) 
	{
		if(trainerToAdd.getFirstName().equals("Jordan")) {
			return null;
		}
		return repo.save(trainerToAdd);
	}
	
	public String deleteTrainer(Long primaryKeyOfTrainer) {
		repo.deleteById(primaryKeyOfTrainer);
		return "Trainer succesffulyy deleted";
	}


}
